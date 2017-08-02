package com.amocrm.amocrmclient.auth.impl;

import com.amocrm.amocrmclient.AmoCrmClientBuilder;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.iface.IAuthorizationAPI;

import lombok.Setter;
import lombok.experimental.Accessors;
import retrofit2.Retrofit;


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
