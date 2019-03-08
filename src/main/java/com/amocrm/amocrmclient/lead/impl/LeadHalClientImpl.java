package com.amocrm.amocrmclient.lead.impl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import retrofit2.Response;

import com.amocrm.amocrmclient.lead.entity.AcceptIncLeadRequest;
import com.amocrm.amocrmclient.lead.entity.AddIncomingLead;
import com.amocrm.amocrmclient.lead.entity.DeclineIncLeadRequest;
import com.amocrm.amocrmclient.lead.entity.IncLeadResponse;
import com.amocrm.amocrmclient.lead.entity.IncomingLead;
import com.amocrm.amocrmclient.lead.entity.IncomingLeadAdd;
import com.amocrm.amocrmclient.lead.entity.Lead;
import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.iface.ILeadHalAPI;
import com.amocrm.amocrmclient.lead.LeadHalClient;
import com.amocrm.amocrmclient.response.HalResponse;


class LeadHalClientImpl implements LeadHalClient, WithAuthClient {

    private AuthClient authClient;

    private AccountClient accountClient;

    private ILeadHalAPI leadHalAPI;

    LeadHalClientImpl(AuthClient authClient, AccountClient accountClient, ILeadHalAPI leadHalAPI) {
        this.authClient = authClient;
        this.accountClient = accountClient;
        this.leadHalAPI = leadHalAPI;
    }

    public ILeadHalAPI api() {
        return leadHalAPI;
    }

    public AuthClient getAuthClient() {

        return authClient;
    }

    public AccountClient getAccountClient() {
        return accountClient;
    }

    public Response<HalResponse<AddOrUpdResponse>> add(Lead lead) throws IOException {
        AddOrUpdate<Lead> addLead = new AddOrUpdate<>();

        List<Lead> leads = new ArrayList<>();
        leads.add(lead);

        addLead.setAdd(leads);

        return leadHalAPI.addOrUpdate(addLead).execute();
    }

    public Response<HalResponse<AddOrUpdResponse>> add(Collection<Lead> leads) throws IOException {
        AddOrUpdate<Lead> addLead = new AddOrUpdate<>();

        addLead.setAdd(leads);

        return leadHalAPI.addOrUpdate(addLead).execute();
    }

    public Response<HalResponse<AddOrUpdResponse>> update(Lead lead) throws IOException {
        AddOrUpdate<Lead> addLead = new AddOrUpdate<>();

        List<Lead> leads = new ArrayList<>();
        leads.add(lead);

        addLead.setUpdate(leads);

        return leadHalAPI.addOrUpdate(addLead).execute();
    }

    public Response<HalResponse<AddOrUpdResponse>> update(Collection<Lead> leads) throws IOException {
        AddOrUpdate<Lead> addLead = new AddOrUpdate<>();

        addLead.setUpdate(leads);

        return leadHalAPI.addOrUpdate(addLead).execute();
    }

    public Response<HalResponse<Lead>>list(String query, Long id, String responsibleUserId, String status, int limitRows, int limitOffset) throws IOException {

        if (id != null) {

            return leadHalAPI.list(id).execute();

        } else if (responsibleUserId != null) {

            return leadHalAPI.listByResponsibleUserId(responsibleUserId).execute();

        } else if (query != null) {

            if (limitRows >= 0 && limitOffset >= 0) {

                return leadHalAPI.list(query, limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return leadHalAPI.list(query, limitRows).execute();

            }

            return leadHalAPI.list(query).execute();

        } else if (responsibleUserId != null) {

            if (limitRows >= 0 && limitOffset >= 0) {

                return leadHalAPI.listByResponsibleUserId(responsibleUserId, limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return leadHalAPI.listByResponsibleUserId(responsibleUserId, limitRows).execute();

            }

            return leadHalAPI.listByResponsibleUserId(responsibleUserId).execute();

        } else if (status != null) {

            if (limitRows >= 0 && limitOffset >= 0) {

                return leadHalAPI.listByStatusId(status, limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return leadHalAPI.listByStatusId(status, limitRows).execute();

            }

            return leadHalAPI.listByStatusId(status).execute();

        } else {

            if (limitRows >= 0 && limitOffset >= 0) {

                return leadHalAPI.list(limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return leadHalAPI.list(limitRows).execute();

            }

            return leadHalAPI.list().execute();
        }
    }

    public Response<HalResponse<Lead>>list(String query) throws IOException {

        return list(query, null, null, null, -1, -1);
    }

    public Response<HalResponse<Lead>>list(String query, int limitRows) throws IOException {

        return list(query, null, null, null, limitRows, -1);
    }

    public Response<HalResponse<Lead>>list(String query, int limitRows, int limitOffset) throws IOException {

        return list(query, null, null, null, -1, limitOffset);
    }

    public Response<HalResponse<Lead>>list() throws IOException {

        return list(null, null, null, null, -1, -1);
    }

    public Response<HalResponse<Lead>>list(int limitRows) throws IOException {

        return list(null, null, null, null, limitRows, -1);
    }

    public Response<HalResponse<Lead>>list(int limitRows, int limitOffset) throws IOException {

        return list(null, null, null, null, limitRows, limitOffset);
    }

    public Response<HalResponse<Lead>>listByResponsibleUserId(String responsibleUserId) throws IOException {

        return leadHalAPI.listByResponsibleUserId(responsibleUserId).execute();
    }

    public Response<HalResponse<Lead>>listByResponsibleUserId(String responsibleUserId, int limitRows) throws IOException {

        return leadHalAPI.listByResponsibleUserId(responsibleUserId, limitRows).execute();
    }

    public Response<HalResponse<Lead>>listByResponsibleUserId(String responsibleUserId, int limitRows, int limitOffset) throws IOException {

        return leadHalAPI.listByResponsibleUserId(responsibleUserId, limitRows, limitOffset).execute();
    }

    public Response<HalResponse<Lead>>listSince(String modified) throws IOException {

        return leadHalAPI.listSince(modified).execute();
    }

    public Response<HalResponse<Lead>>listByStatusIds(Collection<Long> statusIds) throws IOException {

        return leadHalAPI.listByStatusIds(statusIds).execute();
    }

    public Response<HalResponse<Lead>>listByStatusIdsSince(Collection<Long> statusIds, String datetime) throws IOException {

        return leadHalAPI.listByStatusIdsSince(statusIds, datetime).execute();
    }

    @Override
    public Response<AddOrUpdate<IncomingLeadAdd>> addIncoming(AddIncomingLead addLead) throws IOException {

        return leadHalAPI.addIncoming(addLead).execute();
    }

    @Override
    public Response<IncLeadResponse> acceptIncoming(AcceptIncLeadRequest acceptIncomingLead) throws IOException {

        return leadHalAPI.acceptIncoming(acceptIncomingLead).execute();
    }

    @Override
    public Response<IncLeadResponse> declineIncoming(DeclineIncLeadRequest declineIncomingLead) throws IOException {

        return leadHalAPI.declineIncoming(declineIncomingLead).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming() throws IOException {

        return leadHalAPI.listIncoming().execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(Integer page) throws IOException {

        return leadHalAPI.listIncoming(page).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(Integer page, Integer pageSize) throws IOException {

        return leadHalAPI.listIncoming(page, pageSize).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(Integer page, Integer pageSize, String[] orderBy) throws IOException {

        return leadHalAPI.listIncoming(page, pageSize, orderBy).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(String[] categories) throws IOException {

        return leadHalAPI.listIncoming(categories).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Integer page) throws IOException {

        return leadHalAPI.listIncoming(categories, page).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Integer page, Integer pageSize) throws IOException {

        return leadHalAPI.listIncoming(categories, page, pageSize).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Integer page, Integer pageSize, String[] orderBy) throws IOException {

        return leadHalAPI.listIncoming(categories, page, pageSize, orderBy).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Long pipelineId) throws IOException {

        return leadHalAPI.listIncoming(categories, pipelineId).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Long pipelineId, Integer page) throws IOException {

        return leadHalAPI.listIncoming(categories, pipelineId, page).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Long pipelineId, Integer page, Integer pageSize) throws IOException {

        return leadHalAPI.listIncoming(categories, pipelineId, page, pageSize).execute();
    }

    @Override
    public Response<HalResponse<IncomingLead>> listIncoming(String[] categories, Long pipelineId, Integer page, Integer pageSize, String[] orderBy) throws IOException {

        return leadHalAPI.listIncoming(categories, pipelineId, page, pageSize, orderBy).execute();
    }

}
