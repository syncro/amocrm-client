package com.amocrm.amocrmclient.service;


import com.amocrm.amocrmclient.entity.AddLead;
import com.amocrm.amocrmclient.entity.AddLeadResponse;
import com.amocrm.amocrmclient.entity.AddLeads;
import com.amocrm.amocrmclient.entity.AuthResponse;
import com.amocrm.amocrmclient.entity.SetLead;
import com.amocrm.amocrmclient.entity.SetLeadRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.util.ArrayList;
import java.util.Map;

import javax.inject.Inject;

import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Component
public class AmoCrmLeadService {

    private static final Logger logger = LoggerFactory.getLogger(AmoCrmLeadService.class);

    AmoCrmAuthService authService;

    @Inject public AmoCrmLeadService(AmoCrmAuthService authService) {
        this.authService = authService;
    }

    public SetLead createLead(String name, int price) {
        SetLead setLead = new SetLead();
        AddLead addLead = new AddLead();
        addLead.name = name;
        addLead.price = new BigDecimal(price);
        setLead.request = new SetLeadRequest();
        setLead.request.leads = new AddLeads();
        setLead.request.leads.add = new ArrayList<>();
        setLead.request.leads.add.add(addLead);
        return setLead;
    }

    public Response<AddLeadResponse> setLead(@Body SetLead setLead, Map<String, String> projectSettings) {

        OkHttpClient httpClient = getOkHttpClient();

        Call<AuthResponse> authResponse = authService.auth(httpClient, projectSettings.get("amoCrmHost"),
                projectSettings.get("amoCrmUser"),  projectSettings.get("amoCrmPassword"));

        Response response = null;
        try {
            response = authResponse.execute();
            if (response.isSuccessful()) {

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(projectSettings.get("amoCrmHost"))
                        .client(httpClient)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .build();

                ILeadAPI leadAPI = retrofit.create(ILeadAPI.class);

                return leadAPI.setLead(setLead).execute();
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error placing the lead", e);
        }
        return null;
    }

    private OkHttpClient getOkHttpClient() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);

        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.addInterceptor(logging);

        CookieHandler cookieHandler = new CookieManager();
        JavaNetCookieJar jncj = new JavaNetCookieJar(cookieHandler);

        httpClientBuilder.cookieJar(jncj);
        httpClientBuilder.build();

        return httpClientBuilder.build();
    }
}
