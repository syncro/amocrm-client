package com.amocrm.amocrmclient.account.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;

import com.amocrm.amocrmclient.AmoCrmClientBuilder;
import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.account.entity.current.ACLimits;
import com.amocrm.amocrmclient.account.entity.current.ACLimitsDeserializer;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.auth.impl.AuthClientBuilder;
import com.amocrm.amocrmclient.iface.IAccountAPI;

import lombok.experimental.Accessors;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Accessors(chain = true, fluent = true)
public class AccountClientBuilder extends AmoCrmClientBuilder {

    private String baseUrl;

    private String login;

    private String passwordHash;

    private OkHttpClient httpClient;

    public AccountClient build() {

        if (httpClient == null) {
            httpClient = getOkHttpClient();
        }

        JsonDeserializer<ACLimits> acLimitsDeserializer = new ACLimitsDeserializer();

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(ACLimits.class, acLimitsDeserializer)
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        AuthClient authClient = new AuthClientBuilder()
                .login(login)
                .passwordHash(passwordHash)
                .retrofit(retrofit).build();

        IAccountAPI accountAPI = retrofit.create(IAccountAPI.class);

        return new AccountClientImpl(authClient, accountAPI);
    }

    public AccountClientBuilder baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public AccountClientBuilder login(String login) {
        this.login = login;
        return this;
    }

    public AccountClientBuilder passwordHash(String passwordHash) {
        this.passwordHash = passwordHash;
        return this;
    }

    public AccountClientBuilder httpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }
}
