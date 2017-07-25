package com.amocrm.amocrmclient.customer;




import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.customer.entity.list.LCResponseData;
import com.amocrm.amocrmclient.customer.entity.set.SCResponseData;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;


public class AmoCrmClientCustomerTest extends AmoCrmClientTest {

    @SneakyThrows
    private CustomerClient getCustomerClient() {
        Properties properties = getProperties();

        return new CustomerClientBuilder()
                .baseUrl(properties.getProperty("amocrm.baseurl"))
                .login(properties.getProperty("amocrm.login"))
                .passwordHash(properties.getProperty("amocrm.passwordhash"))
                .build();
    }

    @Test
    @Ignore
    public void testSetCustomer() {

        CustomerClient customerClient = getCustomerClient();
        Response<SCResponseData> setCustomerResponse = null;
        try {
            setCustomerResponse = customerClient.setCustomer("Horns & Hooves");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(setCustomerResponse.body().response.customers.add.customers.size() > 0);
    }

    @Test
    @Ignore
    public void testListContacts() {

        CustomerClient customerClient = getCustomerClient();
        Response<SCResponseData> setCustomerResponse = null;
        try {
            setCustomerResponse = customerClient.setCustomer("John Doe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Response<LCResponseData> customersResponse = null;
        try {
            customersResponse = customerClient.list();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(customersResponse.body().response.customers.size() > 0);
    }

}
