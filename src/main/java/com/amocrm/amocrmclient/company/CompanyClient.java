package com.amocrm.amocrmclient.company;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.company.entity.list.LCResponseData;
import com.amocrm.amocrmclient.company.entity.set.SCParam;
import com.amocrm.amocrmclient.company.entity.set.SCResponseData;
import com.amocrm.amocrmclient.iface.ICompanyAPI;

import java.io.IOException;
import java.util.Map;

import retrofit2.Response;

public interface CompanyClient {

    ICompanyAPI api();

    SCParam createCompany(String name);

    SCParam setCompanyCustomFields(SCParam setCompany, Map<String, String> fieldValues, Long linkedLeadId) throws IOException;

    Response<SCResponseData> setCompany(String name) throws IOException;

    @AuthWithClient
    Response<SCResponseData> setCompany(SCParam setCompany) throws IOException;

    @AuthWithClient
    Response<LCResponseData> list(String query, int limitRows, int limitOffset, Long id, String responsibleUserId) throws IOException;

    Response<LCResponseData> list(String query) throws IOException;

    Response<LCResponseData> list() throws IOException;

}
