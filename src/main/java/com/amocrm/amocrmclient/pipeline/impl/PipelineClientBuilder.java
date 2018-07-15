package com.amocrm.amocrmclient.pipeline.impl;

import com.amocrm.amocrmclient.AmoCrmClientBuilder;
import com.amocrm.amocrmclient.auth.AuthProxy;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.auth.impl.AuthClientBuilder;
import com.amocrm.amocrmclient.iface.IPipelineAPI;
import com.amocrm.amocrmclient.pipeline.PipelineClient;
import lombok.Setter;
import lombok.experimental.Accessors;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.lang.reflect.Proxy;


@Setter
@Accessors(chain = true, fluent = true)
public class PipelineClientBuilder extends AmoCrmClientBuilder {

    private String baseUrl;

    private String login;

    private String passwordHash;

    private OkHttpClient httpClient;

    public PipelineClient build() {

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

        IPipelineAPI pipelineAPI = retrofit.create(IPipelineAPI.class);

        PipelineClientImpl impl = new PipelineClientImpl(authClient, pipelineAPI);

        PipelineClient implProxy = (PipelineClient) Proxy.newProxyInstance(
                impl.getClass().getClassLoader(),
                impl.getClass().getInterfaces(), new AuthProxy(impl)
        );

        return implProxy;
    }
}
