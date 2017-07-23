package com.amocrm.amocrmclient.auth;

import com.amocrm.amocrmclient.AmoCrmClientBuilder;
import com.amocrm.amocrmclient.auth.impl.AuthClientImpl;
import com.amocrm.amocrmclient.iface.IAuthorizationAPI;
import com.amocrm.amocrmclient.iface.ILeadAPI;
import com.amocrm.amocrmclient.lead.LeadClient;
import com.amocrm.amocrmclient.lead.impl.LeadClientImpl;

import lombok.Setter;
import lombok.experimental.Accessors;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Setter
@Accessors(chain = true, fluent = true)
public class AuthClientBuilder extends AmoCrmClientBuilder {

    private String login;

    private String passwordHash;

    private Retrofit retrofit;

    public AuthClient build() {

        IAuthorizationAPI authAPI = retrofit.create(IAuthorizationAPI.class);

        return new AuthClientImpl(login, passwordHash, authAPI);
    }
}
