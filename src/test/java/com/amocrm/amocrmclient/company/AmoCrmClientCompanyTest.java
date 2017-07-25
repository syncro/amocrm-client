package com.amocrm.amocrmclient.company;



import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.company.entity.list.LCResponseData;
import com.amocrm.amocrmclient.company.entity.set.SCResponseData;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;


public class AmoCrmClientCompanyTest extends AmoCrmClientTest {

    @SneakyThrows
    private CompanyClient getCompanyClient() {
        Properties properties = getProperties();

        return new CompanyClientBuilder()
                .baseUrl(properties.getProperty("amocrm.baseurl"))
                .login(properties.getProperty("amocrm.login"))
                .passwordHash(properties.getProperty("amocrm.passwordhash"))
                .build();
    }

    @Test
    @Ignore
    public void testSetCompany() {

        CompanyClient companyClient = getCompanyClient();
        Response<SCResponseData> setCompanyResponse = null;
        try {
            setCompanyResponse = companyClient.setCompany("Horns & Hooves");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(setCompanyResponse.body().response.contacts.add.size() > 0);
    }

    @Test
    @Ignore
    public void testListContacts() {

        CompanyClient companyClient = getCompanyClient();
        Response<SCResponseData> setCompanyResponse = null;
        try {
            setCompanyResponse = companyClient.setCompany("Horns & Hooves");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Response<LCResponseData> companiesResponse = null;
        try {
            companiesResponse = companyClient.list();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(companiesResponse.body().response.contacts.size() > 0);
    }

}
