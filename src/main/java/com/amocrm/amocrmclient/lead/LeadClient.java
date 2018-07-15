package com.amocrm.amocrmclient.lead;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.iface.ILeadAPI;
import com.amocrm.amocrmclient.lead.entity.list.LLResponseData;
import com.amocrm.amocrmclient.lead.entity.set.SLAdd;
import com.amocrm.amocrmclient.lead.entity.set.SLParam;
import com.amocrm.amocrmclient.lead.entity.set.SLResponseData;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import retrofit2.Response;

public interface LeadClient {

    ILeadAPI api();

    SLParam createLead(String name, int price);

    SLParam createLead(String name);

    Response<SLResponseData> setLead(String name, int price) throws IOException;

    @AuthWithClient
    Response<SLResponseData> setLead(SLParam setLead) throws IOException;

    SLAdd fillContactCustomFields(SLAdd slAdd, Map<String, String> fieldValues) throws IOException;

    @AuthWithClient
    Response<LLResponseData> list(String query, Long id, String responsibleUserId, String status, int limitRows, int limitOffset) throws IOException;

    Response<LLResponseData> list(String query) throws IOException;

    Response<LLResponseData> list() throws IOException;

    @AuthWithClient
    Response<LLResponseData> listSince(String modified) throws IOException;

    @AuthWithClient
    Response<LLResponseData> listByStatusIds(Collection<Long> statusIds) throws IOException;

    @AuthWithClient
    Response<LLResponseData> listByStatusIdsSince(Collection<Long> statusIds, String datetime) throws IOException;


}
