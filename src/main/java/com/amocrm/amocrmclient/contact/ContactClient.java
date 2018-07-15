package com.amocrm.amocrmclient.contact;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.contact.entity.links.CLResponseData;
import com.amocrm.amocrmclient.contact.entity.list.LCResponseData;
import com.amocrm.amocrmclient.contact.entity.set.SCParam;
import com.amocrm.amocrmclient.contact.entity.set.SCResponseData;
import com.amocrm.amocrmclient.iface.IContactAPI;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import retrofit2.Response;

public interface ContactClient {

    IContactAPI api();

    SCParam createContact(String name);

    SCParam createForUpdate(Long id, String name);

    SCParam setContactCustomFields(SCParam setContact, Map<String, String> fieldValues, Long linkedLeadId, boolean update) throws IOException;

    Response<SCResponseData> setContact(String name) throws IOException;

    @AuthWithClient
    Response<SCResponseData> setContact(SCParam setContact) throws IOException;

    @AuthWithClient
    Response<LCResponseData> list(String query, int limitRows, int limitOffset,
                                  Long id, String responsibleUserId, String type) throws IOException;

    /**
     * returns contacts that where changed after datetime passed
     * @param modified e.g. IF-MODIFIED-SINCE: Mon, 01 Aug 2013 07:07:23
     * @return
     * @throws IOException
     */
    @AuthWithClient
    Response<LCResponseData> listSince(String modified) throws IOException;

    @AuthWithClient
    Response<LCResponseData> listByIdsSince(List<String> ids, String modified) throws IOException;

    Response<LCResponseData> list(String query) throws IOException;

    Response<LCResponseData> list() throws IOException;

    @AuthWithClient
    Response<LCResponseData> list(Collection<String> ids) throws IOException;

    Response<LCResponseData> list(int limitRows) throws IOException;

    Response<LCResponseData> list(int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<CLResponseData> links() throws IOException;

    @AuthWithClient
    Response<CLResponseData> linksByContacts(Collection<String> contactIds) throws IOException;

    @AuthWithClient
    Response<CLResponseData> linksByLeads(Collection<String> leadIds) throws IOException;

    @AuthWithClient
    Response<CLResponseData> linksByLeads(Collection<String> leadIds, int limitRows, int limitOffset) throws IOException;
}
