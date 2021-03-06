package com.amocrm.amocrmclient.lead.impl;

import com.amocrm.amocrmclient.AmoCrmClientBuilder;
import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.account.impl.AccountClientBuilder;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.auth.AuthProxy;
import com.amocrm.amocrmclient.auth.impl.AuthClientBuilder;
import com.amocrm.amocrmclient.iface.ILeadHalAPI;
import com.amocrm.amocrmclient.lead.LeadHalClient;
import lombok.experimental.Accessors;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.lang.reflect.Proxy;


@Accessors(chain = true, fluent = true)
public class LeadHalClientBuilder extends AmoCrmClientBuilder {

    private String baseUrl;

    private String login;

    private String passwordHash;

    private OkHttpClient httpClient;

    public LeadHalClient build() {

        if (httpClient == null) {
            httpClient = getOkHttpClient();
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        AuthClient authClient = new AuthClientBuilder()
                .login(login)
                .passwordHash(passwordHash)
                .retrofit(retrofit).build();

        ILeadHalAPI leadAPI = retrofit.create(ILeadHalAPI.class);

        AccountClient accountClient = new AccountClientBuilder()
                .baseUrl(baseUrl).httpClient(httpClient)
                .login(login).passwordHash(passwordHash).build();

        LeadHalClientImpl impl = new LeadHalClientImpl(authClient, accountClient, leadAPI);

        LeadHalClient implProxy = (LeadHalClient) Proxy.newProxyInstance(
                impl.getClass().getClassLoader(),
                impl.getClass().getInterfaces(), new AuthProxy(impl)
        );

        return implProxy;
    }

    public LeadHalClientBuilder baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public LeadHalClientBuilder login(String login) {
        this.login = login;
        return this;
    }

    public LeadHalClientBuilder passwordHash(String passwordHash) {
        this.passwordHash = passwordHash;
        return this;
    }

    public LeadHalClientBuilder httpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }
}
