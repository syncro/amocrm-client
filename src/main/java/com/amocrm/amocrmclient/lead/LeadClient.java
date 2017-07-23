package com.amocrm.amocrmclient.lead;


import com.amocrm.amocrmclient.iface.ILeadAPI;
import com.amocrm.amocrmclient.lead.entity.list.LLResponseData;
import com.amocrm.amocrmclient.lead.entity.set.SLParam;
import com.amocrm.amocrmclient.lead.entity.set.SLResponseData;

import java.io.IOException;

import retrofit2.Response;

public interface LeadClient {

    ILeadAPI api();

    Response<SLResponseData> setLead(String name, int price) throws IOException;

    Response<SLResponseData> setLead(SLParam setLead) throws IOException;

    Response<LLResponseData> list(String query, Long id, String responsibleUserId, String status, int limitRows, int limitOffset) throws IOException;

    Response<LLResponseData> list(String query) throws IOException;

    Response<LLResponseData> list() throws IOException;
}
