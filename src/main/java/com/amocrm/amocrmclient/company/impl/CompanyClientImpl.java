package com.amocrm.amocrmclient.company.impl;


import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.account.entity.CustomFieldSettings;
import com.amocrm.amocrmclient.account.entity.current.ACData;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.company.CompanyClient;
import com.amocrm.amocrmclient.company.entity.list.LCResponseData;
import com.amocrm.amocrmclient.company.entity.set.SCParam;
import com.amocrm.amocrmclient.company.entity.set.SCRequest;
import com.amocrm.amocrmclient.company.entity.set.SCRequestAdd;
import com.amocrm.amocrmclient.company.entity.set.SCRequestContacts;
import com.amocrm.amocrmclient.company.entity.set.SCResponseData;
import com.amocrm.amocrmclient.entity.CustomField;
import com.amocrm.amocrmclient.entity.CustomFieldValue;
import com.amocrm.amocrmclient.iface.ICompanyAPI;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Response;

class CompanyClientImpl implements CompanyClient, WithAuthClient {

    private AuthClient authClient;

    private AccountClient accountClient;

    private ICompanyAPI companyAPI;

    public CompanyClientImpl(AuthClient authClient, AccountClient accountClient, ICompanyAPI companyAPI) {
        this.authClient = authClient;
        this.accountClient = accountClient;
        this.companyAPI = companyAPI;
    }

    public ICompanyAPI api() {
        return companyAPI;
    }

    public SCParam createCompany(String name) {

        SCParam setCompany = new SCParam();
        setCompany.request = new SCRequest();
        setCompany.request.contacts = new SCRequestContacts();
        setCompany.request.contacts.add = new ArrayList<>();
        SCRequestAdd setCompanyAdd = new SCRequestAdd();
        setCompanyAdd.name = name;
        setCompany.request.contacts.add.add(setCompanyAdd);

        return setCompany;
    }

    public SCParam setCompanyCustomFields(SCParam setCompany, Map<String, String> fieldValues, Long linkedLeadId) throws IOException {

        Response<ACData> accountsDataRequest = accountClient.data();

        if (accountsDataRequest.isSuccessful()) {

            List<CustomFieldSettings> customFields =
                    accountsDataRequest.body().response.account.customFields.contacts;

            Map<String, CustomFieldSettings> customFieldsMap = new HashMap<>();

            for (CustomFieldSettings customField : customFields) {
                customFieldsMap.put(customField.name, customField);
            }

            if (linkedLeadId != null) {
                setCompany.request.contacts.add.get(0).linkedLeadsId = new ArrayList<>();
                setCompany.request.contacts.add.get(0).linkedLeadsId.add(linkedLeadId);
            }

            setCompany.request.contacts.add.get(0).customFields = new ArrayList<>();
            for (String fieldName : fieldValues.keySet()) {
                CustomFieldSettings customFieldSettings = customFieldsMap.get(fieldName);
                if ("Y".equals(customFieldSettings.multiple)) {
                    CustomField customField = new CustomField();
                    customField.id = customFieldsMap.get(fieldName).id;
                    customField.values = new ArrayList<>();
                    CustomFieldValue fieldValue = new CustomFieldValue();
                    fieldValue.value = fieldValues.get(fieldName);
                    customField.values.add(fieldValue);
                    if ("Phone".equals(fieldName)) {
                        fieldValue.enumer = "MOB";
                    } else if ("Email".equals(fieldName)) {
                        fieldValue.enumer = "WORK";
                    }
                    setCompany.request.contacts.add.get(0).customFields.add(customField);
                } else {

                }


            }
            return setCompany;
        }
        return null;
    }

    public Response<SCResponseData> setCompany(String name) throws IOException {

        SCParam setCompany = createCompany(name);

        return setCompany(setCompany);
    }

    public Response<SCResponseData> setCompany(SCParam setCompany) throws IOException {

        return companyAPI.setCompany(setCompany).execute();

    }

    public Response<LCResponseData> list(String query, int limitRows, int limitOffset, Long id, String responsibleUserId) throws IOException {

        if (id != null) {

            return companyAPI.list(id).execute();

        } else if (responsibleUserId != null) {

            return companyAPI.listByResponsibleUserId(responsibleUserId).execute();

        } else {
            if (limitRows >= 0 && limitOffset >= 0 && query != null) {

                return companyAPI.list(query, limitRows, limitOffset).execute();

            } else if (query == null && limitRows >= 0 && limitOffset >= 0) {

                return companyAPI.list(limitRows, limitOffset).execute();

            } else {

                return companyAPI.list().execute();

            }
        }
    }

    public Response<LCResponseData> list(String query) throws IOException {

        return list(query, -1, -1, null, null);

    }

    public Response<LCResponseData> list() throws IOException {

        return list(null, -1, -1, null, null);

    }

    @Override
    public AuthClient getAuthClient() {

        return authClient;

    }
}
