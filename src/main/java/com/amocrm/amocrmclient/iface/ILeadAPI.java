package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.lead.entity.set.SLResponseData;
import com.amocrm.amocrmclient.lead.entity.list.LLResponseData;
import com.amocrm.amocrmclient.lead.entity.set.SLParam;

import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ILeadAPI {

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> list();

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> list(@Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> list(@Query("query") String query);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> listSince(@Header("IF-MODIFIED-SINCE") String modified);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> list(@Query("query") String query, @Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> list(@Query("query") String query, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId, @Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);


    /**
     * list leads by statusId
     * @param statusId see all available ad https://developers.amocrm.com/rest_api/accounts_current.php
     * @return response data
     */
    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> listByStatusId(@Query("status") String statusId);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> listByStatusId(@Query("status") String statusId, @Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> listByStatusId(@Query("status") String statusId, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> listByStatusIds(@Query("status[]") Collection<Long> statusId);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> listByStatusIdsSince(@Query("status[]") Collection<Long> statusId, @Header("IF-MODIFIED-SINCE") String modified);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> list(@Query("id") Long id);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> list(@Query("id[]") Long[] id);

    @GET("/private/api/v2/json/leads/list")
    Call<LLResponseData> list(@Query("id[]") List<Long> id);

    @POST("/private/api/v2/json/leads/set")
    Call<SLResponseData> setLead(@Body SLParam setLead);

}
