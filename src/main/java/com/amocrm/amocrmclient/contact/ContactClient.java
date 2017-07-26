package com.amocrm.amocrmclient.contact;


import com.amocrm.amocrmclient.contact.entity.links.CLResponseData;
import com.amocrm.amocrmclient.contact.entity.list.LCResponseData;
import com.amocrm.amocrmclient.contact.entity.set.SCParam;
import com.amocrm.amocrmclient.contact.entity.set.SCResponseData;
import com.amocrm.amocrmclient.iface.IContactAPI;

import java.io.IOException;
import java.util.Map;

import retrofit2.Response;

public interface ContactClient {

    IContactAPI api();

    SCParam createContact(String name);

    SCParam setContactCustomFields(SCParam setContact, Map<String, String> fieldValues, Long linkedLeadId) throws IOException;

    Response<SCResponseData> setContact(String name) throws IOException;

    Response<SCResponseData> setContact(SCParam setContact) throws IOException;

    Response<LCResponseData> list(String query, int limitRows, int limitOffset,
                                  Long id, String responsibleUserId, String type) throws IOException;

    Response<LCResponseData> list(String query) throws IOException;

    Response<LCResponseData> list() throws IOException;

    Response<CLResponseData> links() throws IOException;
}
