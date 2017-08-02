package com.amocrm.amocrmclient.lead;


import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.lead.entity.list.LLResponseData;
import com.amocrm.amocrmclient.lead.entity.set.SLResponseData;
import com.amocrm.amocrmclient.lead.impl.LeadClientBuilder;

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
    @SneakyThrows
    public void testSetLead() {

        LeadClient leadClient = getLeadClient();
        Response<SLResponseData> setLeadResponse = leadClient.setLead("Frodo Buggins", 100);

        assertEquals(setLeadResponse.body().response.leads.add.size(), 1);
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testListLead() {

        LeadClient leadClient = getLeadClient();
        Response<SLResponseData> setLeadResponse = leadClient.setLead("Frodo Buggins", 100);
        Response<LLResponseData> leadsResponse = leadClient.list();

        assertTrue(leadsResponse.body().response.leads.size() > 0);
    }

}
