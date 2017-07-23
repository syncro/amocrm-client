package com.amocrm.amocrmclient;



import com.amocrm.amocrmclient.auth.cookie.JavaNetCookieJar;
import com.amocrm.amocrmclient.auth.cookie.SessionCookieManager;

import java.net.CookieHandler;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class AmoCrmClientBuilder {

    public OkHttpClient getOkHttpClient() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        CookieHandler cookieHandler = new SessionCookieManager();
        JavaNetCookieJar jncj = new JavaNetCookieJar(cookieHandler);

        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .cookieJar(jncj)
                .build();

    }
}
