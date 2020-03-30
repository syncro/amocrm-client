package com.amocrm.amocrmclient.contact.impl;

import com.amocrm.amocrmclient.AmoCrmClientBuilder;
import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.account.impl.AccountClientBuilder;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.auth.AuthProxy;
import com.amocrm.amocrmclient.auth.impl.AuthClientBuilder;
import com.amocrm.amocrmclient.contact.ContactClient;
import com.amocrm.amocrmclient.contact.ContactHalClient;
import com.amocrm.amocrmclient.iface.IContactAPI;
import com.amocrm.amocrmclient.iface.IContactHalAPI;
import lombok.experimental.Accessors;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.lang.reflect.Proxy;


@Accessors(chain = true, fluent = true)
public class ContactHalClientBuilder extends AmoCrmClientBuilder {

    private String baseUrl;

    private String login;

    private String passwordHash;

    private OkHttpClient httpClient;

    public ContactHalClient build() {

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

        IContactAPI contactAPI = retrofit.create(IContactAPI.class);

        IContactHalAPI contactHalAPI = retrofit.create(IContactHalAPI.class);

        AccountClient accountClient = new AccountClientBuilder()
                .baseUrl(baseUrl).httpClient(httpClient)
                .login(login).passwordHash(passwordHash).build();


        ContactClientImpl clientImpl = new ContactClientImpl(authClient, accountClient, contactAPI);

        ContactClient proxy = (ContactClient) Proxy.newProxyInstance(
                clientImpl.getClass().getClassLoader(),
                clientImpl.getClass().getInterfaces(), new AuthProxy(clientImpl)
        );

        ContactHalClientImpl impl = new ContactHalClientImpl(authClient, accountClient, contactHalAPI, proxy);

        ContactHalClient implProxy = (ContactHalClient) Proxy.newProxyInstance(
                impl.getClass().getClassLoader(),
                impl.getClass().getInterfaces(), new AuthProxy(impl)
        );

        return implProxy;
    }

    public ContactHalClientBuilder baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public ContactHalClientBuilder login(String login) {
        this.login = login;
        return this;
    }

    public ContactHalClientBuilder passwordHash(String passwordHash) {
        this.passwordHash = passwordHash;
        return this;
    }

    public ContactHalClientBuilder httpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }
}