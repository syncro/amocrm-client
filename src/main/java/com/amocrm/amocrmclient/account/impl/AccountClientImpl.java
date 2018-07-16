package com.amocrm.amocrmclient.account.impl;


import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.account.entity.current.ACData;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.entity.AuthResponse;
import com.amocrm.amocrmclient.iface.IAccountAPI;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

class AccountClientImpl implements AccountClient {

    private AuthClient authClient;

    private IAccountAPI accountAPI;

    public AccountClientImpl(AuthClient authClient, IAccountAPI accountAPI) {
        this.authClient = authClient;
        this.accountAPI = accountAPI;
    }

    public IAccountAPI api() {
        return accountAPI;
    }

    public Response<ACData> data() throws IOException {

        Call<AuthResponse> authRequest = authClient.auth();

        Response response = authRequest.execute();
        if (response.isSuccessful()) {

            return accountAPI.current().execute();
        } else {
            throw new IOException("Authorization failed");
        }

    }
}
