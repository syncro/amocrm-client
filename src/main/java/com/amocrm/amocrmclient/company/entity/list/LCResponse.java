package com.amocrm.amocrmclient.company.entity.list;


import com.amocrm.amocrmclient.contact.entity.ResponseContact;

import java.util.List;

public class LCResponse {

    public List<ResponseContact> contacts;

    public List<ResponseContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<ResponseContact> contacts) {
        this.contacts = contacts;
    }
}
