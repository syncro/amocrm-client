package com.amocrm.amocrmclient.service;


import com.amocrm.amocrmclient.entity.AuthRequest;
import com.amocrm.amocrmclient.entity.AuthResponse;
import org.springframework.stereotype.Component;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.POST;

@Component
public class AmoCrmAuthService {

    public Call<AuthResponse> auth(OkHttpClient httpClient, String baseUrl, String login, String passwordHash) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        IAuthorizationAPI authAPI = retrofit.create(IAuthorizationAPI.class);
        AuthRequest authRequest = new AuthRequest();
        authRequest.USER_LOGIN = login;
        authRequest.USER_HASH = passwordHash;

        return authAPI.auth(authRequest);
    }

}
