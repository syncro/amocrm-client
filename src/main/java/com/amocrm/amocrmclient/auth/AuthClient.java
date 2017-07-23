package com.amocrm.amocrmclient.auth;

import com.amocrm.amocrmclient.entity.AuthResponse;
import com.amocrm.amocrmclient.iface.IAuthorizationAPI;

import okhttp3.OkHttpClient;
import retrofit2.Call;

public interface AuthClient {

    Call<AuthResponse> auth();

    IAuthorizationAPI api();

}
