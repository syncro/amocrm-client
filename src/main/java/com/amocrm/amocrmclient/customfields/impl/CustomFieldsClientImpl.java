package com.amocrm.amocrmclient.customfields.impl;


import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.customfields.CustomFieldsClient;
import com.amocrm.amocrmclient.customfields.entity.set.SFParam;
import com.amocrm.amocrmclient.customfields.entity.set.SFRequest;
import com.amocrm.amocrmclient.customfields.entity.set.SFRequestFields;
import com.amocrm.amocrmclient.customfields.entity.set.SFResponseData;
import com.amocrm.amocrmclient.iface.ICustomFieldsAPI;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Response;

class CustomFieldsClientImpl implements CustomFieldsClient, WithAuthClient {

    private AuthClient authClient;

    private AccountClient accountClient;

    private ICustomFieldsAPI customFieldsAPI;

    public CustomFieldsClientImpl(AuthClient authClient, AccountClient accountClient, ICustomFieldsAPI customFieldsAPI) {
        this.authClient = authClient;
        this.accountClient = accountClient;
        this.customFieldsAPI = customFieldsAPI;
    }

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

    @Override
    public AuthClient getAuthClient() {

        return authClient;

    }
}
