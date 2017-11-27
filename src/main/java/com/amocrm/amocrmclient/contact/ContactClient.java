package com.amocrm.amocrmclient.contact;


import com.amocrm.amocrmclient.contact.entity.links.CLResponseData;
import com.amocrm.amocrmclient.contact.entity.list.LCResponseData;
import com.amocrm.amocrmclient.contact.entity.set.SCParam;
import com.amocrm.amocrmclient.contact.entity.set.SCResponseData;
import com.amocrm.amocrmclient.iface.IContactAPI;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ContactClient {

    IContactAPI api();

    SCParam createContact(String name);

    SCParam createForUpdate(Long id, String name);

    SCParam setContactCustomFields(SCParam setContact, Map<String, String> fieldValues, Long linkedLeadId, boolean update) throws IOException;

    Response<SCResponseData> setContact(String name) throws IOException;

    Response<SCResponseData> setContact(SCParam setContact) throws IOException;

    Response<LCResponseData> list(String query, int limitRows, int limitOffset,
                                  Long id, String responsibleUserId, String type) throws IOException;

    /**
     * returns contacts that where changed after datetime passed
     * @param modified e.g. IF-MODIFIED-SINCE: Mon, 01 Aug 2013 07:07:23
     * @return
     * @throws IOException
     */
    Response<LCResponseData> listSince(String modified) throws IOException;

    Response<LCResponseData> listByIdsSince(List<String> ids, String modified) throws IOException;

    Response<LCResponseData> list(String query) throws IOException;

    Response<LCResponseData> list() throws IOException;

    Response<LCResponseData> list(Collection<String> ids) throws IOException;

    Response<LCResponseData> list(int limitRows) throws IOException;

    Response<LCResponseData> list(int limitRows, int limitOffset) throws IOException;

    Response<CLResponseData> links() throws IOException;

    Response<CLResponseData> linksByContacts(Collection<String> contactIds) throws IOException;

    Response<CLResponseData> linksByLeads(Collection<String> leadIds) throws IOException;

    Response<CLResponseData> linksByLeads(Collection<String> leadIds, int limitRows, int limitOffset) throws IOException;
}
