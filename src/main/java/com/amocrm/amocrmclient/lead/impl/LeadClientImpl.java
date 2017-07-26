package com.amocrm.amocrmclient.lead.impl;


import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.entity.AuthResponse;
import com.amocrm.amocrmclient.iface.ILeadAPI;
import com.amocrm.amocrmclient.lead.LeadClient;
import com.amocrm.amocrmclient.lead.entity.list.LLResponseData;
import com.amocrm.amocrmclient.lead.entity.set.SLAdd;
import com.amocrm.amocrmclient.lead.entity.set.SLLeads;
import com.amocrm.amocrmclient.lead.entity.set.SLParam;
import com.amocrm.amocrmclient.lead.entity.set.SLRequest;
import com.amocrm.amocrmclient.lead.entity.set.SLResponseData;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import retrofit2.Call;
import retrofit2.Response;


@AllArgsConstructor
public class LeadClientImpl implements LeadClient {

    private AuthClient authClient;

    private ILeadAPI leadAPI;

    public ILeadAPI api() {
        return leadAPI;
    }

    public SLParam createLead(String name, int price) {

        SLParam setLead = new SLParam();
        SLAdd addLead = new SLAdd();
        addLead.name = name;
        addLead.price = new BigDecimal(price);
        setLead.request = new SLRequest();
        setLead.request.leads = new SLLeads();
        setLead.request.leads.add = new ArrayList<>();
        setLead.request.leads.add.add(addLead);

        return setLead;
    }

    @Override
    public Response<SLResponseData> setLead(SLParam setLead) throws IOException {

        Call<AuthResponse> authResponse = authClient.auth();

        Response response = authResponse.execute();

        if (response.isSuccessful()) {

            return leadAPI.setLead(setLead).execute();
        }

        return null;
    }

    @Override
    public Response<SLResponseData> setLead(String name, int price) throws IOException {

        SLParam setLead = createLead(name, price);

        return setLead(setLead);
    }

    public Response<LLResponseData> list(String query, Long id, String responsibleUserId, String status, int limitRows, int limitOffset) throws IOException {

        Call<AuthResponse> authRequest = authClient.auth();

        Response response = authRequest.execute();

        if (response.isSuccessful()) {

            if (id != null) {

                return leadAPI.list(id).execute();

            } else if (responsibleUserId != null) {

                return leadAPI.listByResponsibleUserId(responsibleUserId).execute();

            } else if (query != null) {

                if (limitRows >= 0 && limitOffset >= 0) {
                    return leadAPI.list(query, limitRows, limitOffset).execute();
                } else if (limitRows >= 0) {
                    return leadAPI.list(query, limitRows).execute();
                }

                return leadAPI.list(query).execute();

            } else if (responsibleUserId != null) {

                if (limitRows >= 0 && limitOffset >= 0) {
                    return leadAPI.listByResponsibleUserId(responsibleUserId, limitRows, limitOffset).execute();
                } else if (limitRows >= 0) {
                    return leadAPI.listByResponsibleUserId(responsibleUserId, limitRows).execute();
                }

                return leadAPI.listByResponsibleUserId(responsibleUserId).execute();

            } else if (status != null) {

                if (limitRows >= 0 && limitOffset >= 0) {
                    return leadAPI.listByStatusId(status, limitRows, limitOffset).execute();
                } else if (limitRows >= 0) {
                    return leadAPI.listByStatusId(status, limitRows).execute();
                }

                return leadAPI.listByStatusId(status).execute();

            } else { //
                return leadAPI.list().execute();
            }
        }
        return null;
    }

    public Response<LLResponseData> list(String query) throws IOException {

        return this.list(query, null, null, null, -1, -1);

    }

    public Response<LLResponseData> list() throws IOException {

        return this.list(null, null, null, null, -1, -1);

    }

}
