package com.amocrm.amocrmclient.lead;


import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.lead.entity.IncomingLead;
import com.amocrm.amocrmclient.lead.entity.Lead;
import com.amocrm.amocrmclient.lead.impl.LeadHalClientBuilder;
import com.amocrm.amocrmclient.response.HalResponse;
import lombok.SneakyThrows;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class AmoCrmHalClientLeadTest extends AmoCrmClientTest {

    @SneakyThrows
    private LeadHalClient getLeadClient() {
        Properties properties = getProperties();

        return new LeadHalClientBuilder()
                .baseUrl(properties.getProperty("amocrm.baseurl"))
                .login(properties.getProperty("amocrm.login"))
                .passwordHash(properties.getProperty("amocrm.passwordhash"))
                .build();
    }




    @Test
    @Ignore
    @SneakyThrows
    public void testListLead() throws IOException {

        LeadHalClient leadClient = getLeadClient();

        Response<HalResponse<Lead>> leadsResponse = leadClient.list(10);

        assertTrue(leadsResponse.body().embedded.items.size() <= 10);
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testListIncoming() throws IOException {

        LeadHalClient leadClient = getLeadClient();

        Response<HalResponse<IncomingLead>> leadsResponse = leadClient.listIncoming();

        assertTrue(leadsResponse.body().embedded.items.size() <= 10);
    }

}
