package com.amocrm.amocrmclient.service;


import com.amocrm.amocrmclient.entity.AddLeadResponse;
import com.amocrm.amocrmclient.entity.SetLead;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ILeadAPI {

    @POST("/private/api/v2/json/leads/set")
    Call<AddLeadResponse> setLead(@Body SetLead setLead);

}
