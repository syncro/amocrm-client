package com.amocrm.amocrmclient.service;


import com.amocrm.amocrmclient.entity.AuthRequest;
import com.amocrm.amocrmclient.entity.AuthResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IAuthorizationAPI {

    @POST("/private/api/auth.php?type=json")
    Call<AuthResponse> auth(@Body AuthRequest authRequest);

}
