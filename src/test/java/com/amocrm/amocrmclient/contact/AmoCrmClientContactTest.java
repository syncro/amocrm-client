package com.amocrm.amocrmclient.contact;


import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.contact.entity.list.LCResponseData;
import com.amocrm.amocrmclient.contact.entity.set.SCResponseData;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;


public class AmoCrmClientContactTest extends AmoCrmClientTest {

    @SneakyThrows
    private ContactClient getContactClient() {
        Properties properties = getProperties();

        return new ContactClientBuilder()
                .baseUrl(properties.getProperty("amocrm.baseurl"))
                .login(properties.getProperty("amocrm.login"))
                .passwordHash(properties.getProperty("amocrm.passwordhash"))
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
