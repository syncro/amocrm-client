package com.amocrm.amocrmclient.lead;


import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.lead.entity.list.LLResponseData;
import com.amocrm.amocrmclient.lead.entity.set.SLResponseData;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AmoCrmClientLeadTest extends AmoCrmClientTest {

    @SneakyThrows
    private LeadClient getLeadClient() {
        Properties properties = getProperties();

        return new LeadClientBuilder()
                .baseUrl(properties.getProperty("amocrm.baseurl"))
                .login(properties.getProperty("amocrm.login"))
                .passwordHash(properties.getProperty("amocrm.passwordhash"))
                .build();
    }

    @Test
    @Ignore
    public void testSetLead() {

        LeadClient leadClient = getLeadClient();
        Response<SLResponseData> setLeadResponse = null;
        try {
            setLeadResponse = leadClient.setLead("Frodo Buggins", 100);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(setLeadResponse.body().response.leads.add.size(), 1);
    }

    @Test
    @Ignore
    public void testListLead() {

        LeadClient leadClient = getLeadClient();
        Response<SLResponseData> setLeadResponse = null;
        try {
            setLeadResponse = leadClient.setLead("Frodo Buggins", 100);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Response<LLResponseData> leadsResponse = null;
        try {
            leadsResponse = leadClient.list();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(leadsResponse.body().response.leads.size() > 0);
    }

}
