package com.amocrm.amocrmclient.contact.impl;


import com.amocrm.amocrmclient.account.AccountClient;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.contact.ContactClient;
import com.amocrm.amocrmclient.contact.ContactHalClient;
import com.amocrm.amocrmclient.contact.entity.Contact;
import com.amocrm.amocrmclient.contact.entity.set.SCParam;
import com.amocrm.amocrmclient.contact.entity.set.SCResponseData;
import com.amocrm.amocrmclient.iface.IContactHalAPI;
import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;
import retrofit2.Response;

import java.io.IOException;
import java.util.*;

class ContactHalClientImpl implements ContactHalClient, WithAuthClient {

    private AuthClient authClient;

    private AccountClient accountClient;

    private IContactHalAPI contactHalAPI;

    private ContactClient oldClient;

    public ContactHalClientImpl(AuthClient authClient, AccountClient accountClient, IContactHalAPI contactAPI, ContactClient oldClient) {
        this.authClient = authClient;
        this.accountClient = accountClient;
        this.contactHalAPI = contactAPI;
        this.oldClient = oldClient;
    }

    public IContactHalAPI api() {
        return contactHalAPI;
    }

    @Override
    public SCParam createContact(String name) {
        return oldClient.createContact(name);
    }

    @Override
    public SCParam createForUpdate(Long id, String name) {
        return oldClient.createForUpdate(id, name);
    }

    public SCParam setContactCustomFields(SCParam setContact, Map<String, String> fieldValues, Long linkedLeadId, boolean update) throws IOException {
        return oldClient.setContactCustomFields(setContact, fieldValues, linkedLeadId, update);
    }

    @Override
    public Response<SCResponseData> setContact(String name) throws IOException {
        return oldClient.setContact(name);
    }

    @Override
    public Response<HalResponse<AddOrUpdResponse>> add(AddOrUpdate<Contact> addContact) throws IOException {
        return contactHalAPI.add(addContact).execute();
    }

    public Response<HalResponse<Contact>> list(String query, int limitRows, int limitOffset, Long id, String responsibleUserId, String type) throws IOException {


        if (type != null) {

            if (limitRows >= 0 && limitOffset >= 0) {
                return contactHalAPI.listByType(type, limitRows, limitOffset).execute();
            } else if (limitRows >= 0) {
                return contactHalAPI.listByType(type, limitRows).execute();
            }

            return contactHalAPI.listByType(type).execute();

        } else if (id != null) {

            return contactHalAPI.list(id).execute();

        } else if (responsibleUserId != null) {

            if (limitRows >= 0 && limitOffset >= 0) {
                return contactHalAPI.listByResponsibleUserId(responsibleUserId, limitRows, limitOffset).execute();
            } else if (limitRows >= 0) {
                return contactHalAPI.listByResponsibleUserId(responsibleUserId, limitRows).execute();
            }

            return contactHalAPI.listByResponsibleUserId(responsibleUserId).execute();

        } else if (query != null) {

            if (limitRows >= 0 && limitOffset >= 0) {
                return contactHalAPI.list(query, limitRows, limitOffset).execute();
            } else if (limitRows >= 0) {
                return contactHalAPI.list(query, limitRows).execute();
            }

            return contactHalAPI.list().execute();

        } else {

            if (limitRows >= 0 && limitOffset >= 0) {
                return contactHalAPI.list(limitRows, limitOffset).execute();
            } else if (limitRows >= 0) {
                return contactHalAPI.list(limitRows).execute();
            }

            return contactHalAPI.list().execute();

        }
    }

    public Response<HalResponse<Contact>> listSince(String modified) throws IOException {

        return contactHalAPI.listSince(modified).execute();

    }

    public Response<HalResponse<Contact>> listByIdsSince(List<String> ids, String modified) throws IOException {

        return contactHalAPI.listByIdsSince(ids, modified).execute();

    }

    public Response<HalResponse<Contact>> list(Collection<String> ids) throws IOException {

        return contactHalAPI.list(ids).execute();

    }

    public Response<HalResponse<Contact>> list(String query) throws IOException {

        return list(query, -1, -1, null, null, null);

    }

    public Response<HalResponse<Contact>> list() throws IOException {

        return list(null, -1, -1, null, null, null);

    }

    public Response<HalResponse<Contact>> list(int limitRows) throws IOException {

        return list(null, limitRows, -1, null, null, null);

    }

    public Response<HalResponse<Contact>> list(int limitRows, int limitOffset) throws IOException {

        return list(null, limitRows, limitOffset, null, null, null);

    }

    @Override
    public AuthClient getAuthClient() {

        return authClient;

    }
}
