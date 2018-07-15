package com.amocrm.amocrmclient.customfields;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.customfields.entity.set.SFParam;
import com.amocrm.amocrmclient.customfields.entity.set.SFResponseData;
import com.amocrm.amocrmclient.iface.ICustomFieldsAPI;

import java.io.IOException;

import retrofit2.Response;


public interface CustomFieldsClient {

    ICustomFieldsAPI api();

    SFParam createFields();

    @AuthWithClient
    Response<SFResponseData> setFields(SFParam setFields) throws IOException;

}
