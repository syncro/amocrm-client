package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.contact.ListContactsResponse;
import com.amocrm.amocrmclient.entity.lead.AddLeadResponse;
import com.amocrm.amocrmclient.entity.lead.ListLeadsResponse;
import com.amocrm.amocrmclient.entity.lead.SetLead;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ILeadAPI {

    @GET("/private/api/v2/json/leads/list")
    Call<ListLeadsResponse> list();

    @GET("/private/api/v2/json/leads/list")
    Call<ListContactsResponse> list(@Query("query") String query);

    @GET("/private/api/v2/json/leads/list")
    Call<ListContactsResponse> list(@Query("query") String query, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/leads/list")
    Call<ListContactsResponse> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/leads/list")
    Call<ListContactsResponse> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId);

    /**
     * list leads by statusId
     * @param statusId see all available ad https://developers.amocrm.com/rest_api/accounts_current.php
     * @return
     */
    @GET("/private/api/v2/json/leads/list")
    Call<ListContactsResponse> listByStatusId(@Query("status") String statusId);

    @GET("/private/api/v2/json/leads/list")
    Call<ListContactsResponse> list(@Query("id") Long id);

    @GET("/private/api/v2/json/leads/list")
    Call<ListContactsResponse> list(@Query("id") Long[] id);

    @GET("/private/api/v2/json/leads/list")
    Call<ListContactsResponse> list(@Query("id") List<Long> id);

    @POST("/private/api/v2/json/leads/set")
    Call<AddLeadResponse> setLead(@Body SetLead setLead);

}
