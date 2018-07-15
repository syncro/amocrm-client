package com.amocrm.amocrmclient.customer;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.customer.entity.list.LCFilter;
import com.amocrm.amocrmclient.customer.entity.list.LCResponseData;
import com.amocrm.amocrmclient.customer.entity.set.SCParam;
import com.amocrm.amocrmclient.customer.entity.set.SCResponseData;
import com.amocrm.amocrmclient.iface.ICustomerAPI;

import java.io.IOException;
import java.util.Map;

import retrofit2.Response;


public interface CustomerClient {

    ICustomerAPI api();

    SCParam createCustomer(String name);

    SCParam setCustomFields(SCParam setCustomer, Map<String, String> fieldValues) throws IOException;

    Response<SCResponseData> setCustomer(String name) throws IOException;

    @AuthWithClient
    Response<SCResponseData> setCustomer(SCParam setCustomer) throws IOException;

    @AuthWithClient
    Response<LCResponseData> list(LCFilter filter, int limitRows, int limitOffset) throws IOException;

    Response<LCResponseData> list(LCFilter filter) throws IOException;

    Response<LCResponseData> list() throws IOException;

}
