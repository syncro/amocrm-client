package com.amocrm.amocrmclient.customer.impl;


import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.account.entity.CustomFieldSettings;
import com.amocrm.amocrmclient.account.entity.current.ACData;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.customer.CustomerClient;
import com.amocrm.amocrmclient.customer.entity.list.LCFilter;
import com.amocrm.amocrmclient.customer.entity.list.LCResponseData;
import com.amocrm.amocrmclient.customer.entity.set.SCAdd;
import com.amocrm.amocrmclient.customer.entity.set.SCParam;
import com.amocrm.amocrmclient.customer.entity.set.SCRequest;
import com.amocrm.amocrmclient.customer.entity.set.SCRequestCustomers;
import com.amocrm.amocrmclient.customer.entity.set.SCResponseData;
import com.amocrm.amocrmclient.entity.CustomField;
import com.amocrm.amocrmclient.entity.CustomFieldValue;
import com.amocrm.amocrmclient.iface.ICustomerAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Response;

class CustomerClientImpl implements CustomerClient, WithAuthClient {

    private AuthClient authClient;

    private AccountClient accountClient;

    private ICustomerAPI customerAPI;

    public CustomerClientImpl(AuthClient authClient, AccountClient accountClient, ICustomerAPI customerAPI) {
        this.authClient = authClient;
        this.accountClient = accountClient;
        this.customerAPI = customerAPI;
    }

    public ICustomerAPI api() {
        return customerAPI;
    }

    public SCParam createCustomer(String name) {

        SCParam setCustomer = new SCParam();
        setCustomer.request = new SCRequest();
        setCustomer.request.customers = new SCRequestCustomers();
        setCustomer.request.customers.add = new ArrayList<>();
        SCAdd setCustomerAdd = new SCAdd();
        setCustomerAdd.name = name;
        setCustomer.request.customers.add.add(setCustomerAdd);

        return setCustomer;

    }

    public SCParam setCustomFields(SCParam setCustomer, Map<String, String> fieldValues) throws IOException {

        Response<ACData> accountsDataResponse = accountClient.data();

        if (accountsDataResponse.isSuccessful()) {

            List<CustomFieldSettings> customFields =
                    accountsDataResponse.body().response.account.customFields.contacts;

            Map<String, CustomFieldSettings> customFieldsMap = new HashMap<>();

            for (CustomFieldSettings customField : customFields) {
                customFieldsMap.put(customField.name, customField);
            }

            setCustomer.request.customers.add.get(0).customFields = new ArrayList<>();
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
                    setCustomer.request.customers.add.get(0).customFields.add(customField);
                } else {

                }


            }

            return setCustomer;

        }

        return null;
    }

    public Response<SCResponseData> setCustomer(String name) throws IOException {

        SCParam setCustomer = createCustomer(name);

        return setCustomer(setCustomer);

    }

    public Response<SCResponseData> setCustomer(SCParam setCustomer) throws IOException {

        return customerAPI.setCustomer(setCustomer).execute();

    }

    public Response<LCResponseData> list(LCFilter filter, int limitRows, int limitOffset) throws IOException {

        if (filter != null) {
            if (limitRows >= 0 && limitOffset >= 0) {

                return customerAPI.list(filter, limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return customerAPI.list(limitRows).execute();

            }

            return customerAPI.list(filter).execute();

        }
        if (limitRows >= 0 && limitOffset >= 0) {

            return customerAPI.list(limitRows, limitOffset).execute();

        } else if (limitRows >= 0) {

            return customerAPI.list(limitRows).execute();

        }

        return customerAPI.list().execute();

    }

    public Response<LCResponseData> list(LCFilter filter) throws IOException {

        return list(filter, -1, -1);

    }

    public Response<LCResponseData> list() throws IOException {

        return list(null, -1, -1);

    }

    @Override
    public AuthClient getAuthClient() {

        return authClient;

    }
}
