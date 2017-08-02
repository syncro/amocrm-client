package com.amocrm.amocrmclient.auth.impl;


import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.entity.AuthRequest;
import com.amocrm.amocrmclient.entity.AuthResponse;
import com.amocrm.amocrmclient.iface.IAuthorizationAPI;

import lombok.AllArgsConstructor;
import retrofit2.Call;

@AllArgsConstructor
class AuthClientImpl implements AuthClient {

    private String login;

    private String passwordHash;

    private IAuthorizationAPI authAPI;

    public IAuthorizationAPI api() {
        return authAPI;
    }

    public Call<AuthResponse> auth() {

        AuthRequest authRequest = new AuthRequest();

        authRequest.USER_LOGIN = login;
        authRequest.USER_HASH = passwordHash;

        return authAPI.auth(authRequest);
    }

}
