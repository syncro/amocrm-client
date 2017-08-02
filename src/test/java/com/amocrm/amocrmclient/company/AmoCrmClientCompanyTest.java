package com.amocrm.amocrmclient.company;



import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.company.entity.list.LCResponseData;
import com.amocrm.amocrmclient.company.entity.set.SCResponseData;
import com.amocrm.amocrmclient.company.impl.CompanyClientBuilder;

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
    @SneakyThrows
    public void testSetCompany() {

        CompanyClient companyClient = getCompanyClient();
        Response<SCResponseData> setCompanyResponse = companyClient.setCompany("Horns & Hooves");

        Assert.assertTrue(setCompanyResponse.body().response.contacts.add.size() > 0);
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testListContacts() {

        CompanyClient companyClient = getCompanyClient();
        Response<SCResponseData> setCompanyResponse = companyClient.setCompany("Horns & Hooves");

        Response<LCResponseData> companiesResponse = companyClient.list();
        Assert.assertTrue(companiesResponse.body().response.contacts.size() > 0);
    }

}
