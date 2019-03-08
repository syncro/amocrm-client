package com.amocrm.amocrmclient.lead;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.iface.ILeadHalAPI;
import com.amocrm.amocrmclient.lead.entity.AcceptIncLeadRequest;
import com.amocrm.amocrmclient.lead.entity.AddIncomingLead;
import com.amocrm.amocrmclient.lead.entity.DeclineIncLeadRequest;
import com.amocrm.amocrmclient.lead.entity.IncLeadResponse;
import com.amocrm.amocrmclient.lead.entity.IncomingLead;
import com.amocrm.amocrmclient.lead.entity.IncomingLeadAdd;
import com.amocrm.amocrmclient.lead.entity.Lead;
import com.amocrm.amocrmclient.request.AddOrUpdate;
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

    @AuthWithClient
    Response<AddOrUpdate<IncomingLeadAdd>> addIncoming(AddIncomingLead addLead) throws IOException;

    @AuthWithClient
    Response<IncLeadResponse> acceptIncoming(AcceptIncLeadRequest acceptIncomingLead) throws IOException;

    @AuthWithClient
    Response<IncLeadResponse> declineIncoming(DeclineIncLeadRequest declineIncomingLead) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming() throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(Integer page) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(Integer page, Integer pageSize) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(Integer page, Integer pageSize, String[] orderBy) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(String[] categories) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Integer page) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Integer page, Integer pageSize) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Integer page, Integer pageSize, String[] orderBy) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Long pipelineId) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Long pipelineId, Integer page) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Long pipelineId, Integer page, Integer pageSize) throws IOException;

    @AuthWithClient
    Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Long pipelineId, Integer page, Integer pageSize, String[] orderBy) throws IOException;
}
