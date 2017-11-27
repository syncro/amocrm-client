package com.amocrm.amocrmclient.customfields.impl;


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
import com.amocrm.amocrmclient.customfields.CustomFieldsClient;
import com.amocrm.amocrmclient.customfields.entity.set.SFParam;
import com.amocrm.amocrmclient.customfields.entity.set.SFRequest;
import com.amocrm.amocrmclient.customfields.entity.set.SFRequestFields;
import com.amocrm.amocrmclient.customfields.entity.set.SFResponse;
import com.amocrm.amocrmclient.customfields.entity.set.SFResponseData;
import com.amocrm.amocrmclient.entity.AuthResponse;
import com.amocrm.amocrmclient.entity.CustomField;
import com.amocrm.amocrmclient.entity.CustomFieldValue;
import com.amocrm.amocrmclient.iface.ICustomFieldsAPI;
import com.amocrm.amocrmclient.iface.ICustomerAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import retrofit2.Call;
import retrofit2.Response;

@AllArgsConstructor
class CustomFieldsClientImpl implements CustomFieldsClient {

    private AuthClient authClient;

    private AccountClient accountClient;

    private ICustomFieldsAPI customFieldsAPI;

    public ICustomFieldsAPI api() {
        return customFieldsAPI;
    }

    public SFParam createFields() {

        SFParam setFields = new SFParam();
        SFRequest request = new SFRequest();
        SFRequestFields fields = new SFRequestFields();
        fields.add = new ArrayList<>();
        request.setFields(fields);
        setFields.setRequest(request);

        return setFields;
    }

    public Response<SFResponseData> setFields(SFParam setFields) throws IOException {

        Response<SFResponseData> setFieldsResponse = customFieldsAPI.setFields(setFields).execute();

        return setFieldsResponse;
    }

}
