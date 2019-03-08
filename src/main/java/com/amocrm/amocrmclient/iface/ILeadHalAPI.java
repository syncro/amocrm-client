package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.lead.entity.*;
import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.Collection;
import java.util.List;


public interface ILeadHalAPI {

    @POST("/api/v2/leads")
    Call<HalResponse<AddOrUpdResponse>> addOrUpdate(@Body AddOrUpdate<Lead> addLead);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> list();

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> list(@Query("limit_rows") int limitRows);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> list(@Query("query") String query);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> listSince(@Header("IF-MODIFIED-SINCE") String modified);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> list(@Query("query") String query, @Query("limit_rows") int limitRows);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> list(@Query("query") String query, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId, @Query("limit_rows") int limitRows);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    /**
     * list leads by statusId
     * @param statusId see all available ad https://developers.amocrm.com/rest_api/accounts_current.php
     * @return response data
     */
    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> listByStatusId(@Query("status") String statusId);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> listByStatusId(@Query("status") String statusId, @Query("limit_rows") int limitRows);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> listByStatusId(@Query("status") String statusId, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> listByStatusIds(@Query("status[]") Collection<Long> statusId);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> listByStatusIdsSince(@Query("status[]") Collection<Long> statusId, @Header("IF-MODIFIED-SINCE") String modified);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> list(@Query("id") Long id);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> list(@Query("id[]") Long[] id);

    @GET("/api/v2/leads")
    Call<HalResponse<Lead>> list(@Query("id[]") List<Long> id);

    @POST("/api/v2/incoming_leads/sip")
    Call<AddOrUpdate<IncomingLeadAdd>> addIncoming(@Body AddIncomingLead addLead);

    @POST("/api/v2/incoming_leads/accept")
    Call<IncLeadResponse> acceptIncoming(@Body AcceptIncLeadRequest acceptIncomingLead);

    @POST("/api/v2/incoming_leads/decline")
    Call<IncLeadResponse> declineIncoming(@Body DeclineIncLeadRequest declineIncomingLead);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming();

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("PAGEN_1") Integer page);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("PAGEN_1") Integer page, @Query("page_size") Integer pageSize);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("PAGEN_1") Integer page, @Query("page_size") Integer pageSize, @Query("order_by") String[] orderBy);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("categories") String[] categories);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("categories") String[] categories, @Query("PAGEN_1") Integer page);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("categories") String[] categories, @Query("PAGEN_1") Integer page, @Query("page_size") Integer pageSize);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("categories") String[] categories, @Query("PAGEN_1") Integer page, @Query("page_size") Integer pageSize, @Query("order_by") String[] orderBy);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("categories") String[] categories, @Query("pipeline_id") Long pipelineId);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("categories") String[] categories, @Query("pipeline_id") Long pipelineId, @Query("PAGEN_1") Integer page);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("categories") String[] categories, @Query("pipeline_id") Long pipelineId, @Query("PAGEN_1") Integer page, @Query("page_size") Integer pageSize);

    @GET("/api/v2/incoming_leads")
    Call<HalResponse<IncomingLead>> listIncoming(@Query("categories") String[] categories, @Query("pipeline_id") Long pipelineId, @Query("PAGEN_1") Integer page, @Query("page_size") Integer pageSize, @Query("order_by") String[] orderBy);

}
