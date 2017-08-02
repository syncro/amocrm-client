package com.amocrm.amocrmclient.account.impl;


import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.account.entity.current.ACData;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.entity.AuthResponse;
import com.amocrm.amocrmclient.iface.IAccountAPI;

import java.io.IOException;

import lombok.AllArgsConstructor;
import retrofit2.Call;
import retrofit2.Response;

@AllArgsConstructor
class AccountClientImpl implements AccountClient {

    private AuthClient authClient;

    private IAccountAPI accountAPI;

    public IAccountAPI api() {
        return accountAPI;
    }

    public Response<ACData> data() throws IOException {

        Call<AuthResponse> authRequest = authClient.auth();

        Response response = authRequest.execute();
        if (response.isSuccessful()) {

            return accountAPI.current().execute();
        }

        return null;
    }
}
