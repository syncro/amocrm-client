package com.amocrm.amocrmclient.contact;


import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.contact.entity.Contact;
import com.amocrm.amocrmclient.contact.entity.set.SCResponseData;
import com.amocrm.amocrmclient.contact.impl.ContactHalClientBuilder;
import com.amocrm.amocrmclient.response.HalResponse;
import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.Properties;

public class AmoCrmHalClientContactTest extends AmoCrmClientTest {

    @SneakyThrows
    private ContactHalClient getContactClient() {
        Properties properties = getProperties();

        return new ContactHalClientBuilder()
                .baseUrl(properties.getProperty("amocrm.baseurl"))
                .login(properties.getProperty("amocrm.login"))
                .passwordHash(properties.getProperty("amocrm.passwordhash"))
                .build();
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testSetContact() throws IOException {

        ContactHalClient contactClient = getContactClient();
        Response<SCResponseData> setContactResponse = contactClient.setContact("Frodo Buggins");

        Assert.assertTrue(setContactResponse.body().response.contacts.add.size() > 0);
    }

    @Test
    @Ignore
    public void testListContacts() throws IOException {

        ContactHalClient contactClient = getContactClient();

        Response<HalResponse<Contact>> contactsResponse = contactClient.list(10);

        Assert.assertTrue(contactsResponse.body().embedded.items.size() <= 10);
    }

}
