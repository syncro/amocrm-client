package com.amocrm.amocrmclient.lead.impl;


import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.account.entity.CustomFieldSettings;
import com.amocrm.amocrmclient.account.entity.current.ACData;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.entity.CustomField;
import com.amocrm.amocrmclient.entity.CustomFieldValue;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Response;


class LeadClientImpl implements LeadClient, WithAuthClient {

    private AuthClient authClient;

    private AccountClient accountClient;

    private ILeadAPI leadAPI;

    public LeadClientImpl(AuthClient authClient, AccountClient accountClient, ILeadAPI leadAPI) {
        this.authClient = authClient;
        this.accountClient = accountClient;
        this.leadAPI = leadAPI;
    }

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

    public SLParam createLead(String name) {

        SLParam setLead = new SLParam();
        SLAdd addLead = new SLAdd();
        addLead.name = name;
        setLead.request = new SLRequest();
        setLead.request.leads = new SLLeads();
        setLead.request.leads.add = new ArrayList<>();
        setLead.request.leads.add.add(addLead);

        return setLead;
    }

    @Override
    public Response<SLResponseData> setLead(SLParam setLead) throws IOException {

        return leadAPI.setLead(setLead).execute();

    }


    public SLAdd fillContactCustomFields(SLAdd slAdd, Map<String, String> fieldValues) throws IOException {

        Response<ACData> accountsDataRequest = accountClient.data();

        if (accountsDataRequest.isSuccessful()) {

            List<CustomFieldSettings> customFieldSettings =
                    accountsDataRequest.body().response.account.customFields.getLeads();

            Map<String, CustomFieldSettings> customFieldsMap = new HashMap<>();

            slAdd.customFields = new ArrayList<CustomField>();

            for (CustomFieldSettings customFieldSetting : customFieldSettings) {
                if (fieldValues.get(customFieldSetting.getName()) != null) {

                    CustomField field = new CustomField();
                    field.setId(customFieldSetting.getId());
                    List<CustomFieldValue> values = new ArrayList<>();
                    CustomFieldValue value = new CustomFieldValue();
                    value.setValue(fieldValues.get(customFieldSetting.getName()));
                    values.add(value);
                    field.setValues(values);
                    slAdd.customFields.add(field);
                }
            }

            return slAdd;

        }

        return null;

    }


    @Override
    public Response<SLResponseData> setLead(String name, int price) throws IOException {

        SLParam setLead = createLead(name, price);

        return setLead(setLead);

    }

    public Response<LLResponseData> list(String query, Long id, String responsibleUserId, String status, int limitRows, int limitOffset) throws IOException {

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

        } else {

            return leadAPI.list().execute();
        }
    }

    public Response<LLResponseData> listSince(String modified) throws IOException {

        return leadAPI.listSince(modified).execute();

    }


    public Response<LLResponseData> list(String query) throws IOException {

        return this.list(query, null, null, null, -1, -1);

    }

    public Response<LLResponseData> list() throws IOException {

        return this.list(null, null, null, null, -1, -1);

    }

    public Response<LLResponseData> listByStatusIds(Collection<Long> statusIds) throws IOException {

        return leadAPI.listByStatusIds(statusIds).execute();

    }


    public Response<LLResponseData> listByStatusIdsSince(Collection<Long> statusIds, String datetime) throws IOException {

        return leadAPI.listByStatusIdsSince(statusIds, datetime).execute();

    }

    public AuthClient getAuthClient() {

        return authClient;

    }
}
