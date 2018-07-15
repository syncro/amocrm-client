package com.amocrm.amocrmclient.event.impl;

import com.amocrm.amocrmclient.AmoCrmClientBuilder;
import com.amocrm.amocrmclient.auth.AuthProxy;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.auth.impl.AuthClientBuilder;
import com.amocrm.amocrmclient.event.EventClient;
import com.amocrm.amocrmclient.iface.IEventAPI;

import lombok.Setter;
import lombok.experimental.Accessors;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.lang.reflect.Proxy;


@Setter
@Accessors(chain = true, fluent = true)
public class EventClientBuilder extends AmoCrmClientBuilder {

    private String baseUrl;

    private String login;

    private String passwordHash;

    private OkHttpClient httpClient;

    public EventClient build() {

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

        IEventAPI eventAPI = retrofit.create(IEventAPI.class);

        EventClientImpl impl = new EventClientImpl(authClient, eventAPI);

        EventClient implProxy = (EventClient) Proxy.newProxyInstance(
                impl.getClass().getClassLoader(),
                impl.getClass().getInterfaces(), new AuthProxy(impl)
        );

        return implProxy;
    }
}
