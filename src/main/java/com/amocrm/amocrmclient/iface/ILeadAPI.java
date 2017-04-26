package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.lead.AddLeadResponse;
import com.amocrm.amocrmclient.entity.lead.SetLead;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ILeadAPI {

    @POST("/private/api/v2/json/leads/set")
    Call<AddLeadResponse> setLead(@Body SetLead setLead);

}
