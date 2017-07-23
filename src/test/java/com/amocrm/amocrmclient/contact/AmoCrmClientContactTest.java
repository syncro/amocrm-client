package com.amocrm.amocrmclient.contact;


import com.amocrm.amocrmclient.contact.entity.list.LCResponseData;
import com.amocrm.amocrmclient.contact.entity.set.SCResponseData;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import lombok.SneakyThrows;
import retrofit2.Response;


public class AmoCrmClientContactTest {

    @SneakyThrows
    private ContactClient getContactClient() {
        return new ContactClientBuilder()
                .baseUrl("https://oblozhkotest3.amocrm.com/")
                .login("oblozhko+test3@gmail.com")
                .passwordHash("020f9099563147b1e43cd70d8a87b24b")
                .build();
    }

    @Test
    @Ignore
    public void testSetContact() {

        ContactClient contactClient = getContactClient();
        Response<SCResponseData> setContactResponse = null;
        try {
            setContactResponse = contactClient.setContact("Frodo Buggins");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(setContactResponse.body().response.contacts.add.size() > 0);
    }
    @Test
    @Ignore
    public void testListContacts() {

        ContactClient contactClient = getContactClient();
        Response<SCResponseData> setContactResponse = null;
        try {
            setContactResponse = contactClient.setContact("Frodo Buggins");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Response<LCResponseData> contactsResponse = null;
        try {
            contactsResponse = contactClient.list();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(contactsResponse.body().response.contacts.size() > 0);
    }

}
