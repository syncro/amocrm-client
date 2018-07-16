package com.amocrm.amocrmclient.contact.entity.list;


import com.amocrm.amocrmclient.contact.entity.ResponseContact;

import java.util.List;

/**
 * /private/api/v2/json/contacts/list -- $.response
 */
public class LCResponse {
    /**
     * /private/api/v2/json/contacts/list -- $.response.contacts
     */
    public List<ResponseContact> contacts;

    public List<ResponseContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<ResponseContact> contacts) {
        this.contacts = contacts;
    }
}
