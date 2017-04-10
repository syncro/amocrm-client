package com.amocrm.amocrmclient.service;


import com.amocrm.amocrmclient.entity.AuthResponse;
import com.amocrm.amocrmclient.entity.account.AccountsDataResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Component
public class AmoCrmAccountService {


    private static final Logger logger = LoggerFactory.getLogger(AmoCrmLeadService.class);

    AmoCrmAuthService authService;

    @Inject
    public AmoCrmAccountService(AmoCrmAuthService authService) {
        this.authService = authService;
    }

    public Response<AccountsDataResponse> data(OkHttpClient httpClient, Map<String, String> projectSettings) {

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

                IAccountAPI accountAPI = retrofit.create(IAccountAPI.class);

                return accountAPI.data().execute();
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error reading account data", e);
        }
        return null;
    }

}
