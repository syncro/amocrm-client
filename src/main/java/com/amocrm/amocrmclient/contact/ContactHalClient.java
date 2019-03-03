package com.amocrm.amocrmclient.contact;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.contact.entity.Contact;

import com.amocrm.amocrmclient.contact.entity.set.SCParam;
import com.amocrm.amocrmclient.contact.entity.set.SCResponseData;
import com.amocrm.amocrmclient.iface.IContactHalAPI;
import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;
import retrofit2.Response;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface ContactHalClient {

    IContactHalAPI api();

    SCParam createContact(String name);

    SCParam createForUpdate(Long id, String name);

    SCParam setContactCustomFields(SCParam setContact, Map<String, String> fieldValues, Long linkedLeadId, boolean update) throws IOException;

    Response<SCResponseData> setContact(String name) throws IOException;


    Response<HalResponse<AddOrUpdResponse>> add(AddOrUpdate<Contact> addContact) throws IOException;

    @AuthWithClient
    Response<HalResponse<Contact>> list(String query, int limitRows, int limitOffset,
                                        Long id, String responsibleUserId, String type) throws IOException;

    /**
     * returns contacts that where changed after datetime passed
     * @param modified e.g. IF-MODIFIED-SINCE: Mon, 01 Aug 2013 07:07:23
     * @return
     * @throws IOException
     */
    @AuthWithClient
    Response<HalResponse<Contact>> listSince(String modified) throws IOException;

    @AuthWithClient
    Response<HalResponse<Contact>> listByIdsSince(List<String> ids, String modified) throws IOException;

    @AuthWithClient
    Response<HalResponse<Contact>> list(String query) throws IOException;

    @AuthWithClient
    Response<HalResponse<Contact>> list() throws IOException;

    @AuthWithClient
    Response<HalResponse<Contact>> list(Collection<String> ids) throws IOException;

    @AuthWithClient
    Response<HalResponse<Contact>> list(int limitRows) throws IOException;

    @AuthWithClient
    Response<HalResponse<Contact>> list(int limitRows, int limitOffset) throws IOException;

}
