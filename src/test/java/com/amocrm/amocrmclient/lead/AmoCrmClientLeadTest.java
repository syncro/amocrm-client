package com.amocrm.amocrmclient.lead;


import com.amocrm.amocrmclient.lead.entity.list.LLResponseData;
import com.amocrm.amocrmclient.lead.entity.set.SLResponseData;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import lombok.SneakyThrows;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AmoCrmClientLeadTest {

    @SneakyThrows
    private LeadClient getLeadClient() {
        return new LeadClientBuilder()
                .baseUrl("https://oblozhkotest3.amocrm.com/")
                .login("oblozhko+test3@gmail.com")
                .passwordHash("020f9099563147b1e43cd70d8a87b24b")
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
