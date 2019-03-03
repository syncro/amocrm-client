package com.amocrm.amocrmclient.lead;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.iface.ILeadHalAPI;
import com.amocrm.amocrmclient.lead.entity.Lead;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;

import retrofit2.Response;

import java.io.IOException;
import java.util.Collection;

public interface LeadHalClient {

    ILeadHalAPI api();

    @AuthWithClient
    Response<HalResponse<AddOrUpdResponse>> add(Lead lead) throws IOException;

    @AuthWithClient
    Response<HalResponse<AddOrUpdResponse>> add(Collection<Lead> lead) throws IOException;

    @AuthWithClient
    Response<HalResponse<AddOrUpdResponse>> update(Lead lead) throws IOException;

    @AuthWithClient
    Response<HalResponse<AddOrUpdResponse>> update(Collection<Lead> lead) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> list() throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> list(int limitRows) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> list(String query, Long id, String responsibleUserId, String status, int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> list(String query) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> list(String query, int limitRows) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> list(String query, int limitRows,  int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> listByResponsibleUserId(String responsibleUserId) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> listByResponsibleUserId(String responsibleUserId, int limitRows) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> listByResponsibleUserId(String responsibleUserId, int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> listSince(String modified) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> listByStatusIds(Collection<Long> statusIds) throws IOException;

    @AuthWithClient
    Response<HalResponse<Lead>> listByStatusIdsSince(Collection<Long> statusIds, String datetime) throws IOException;

}
