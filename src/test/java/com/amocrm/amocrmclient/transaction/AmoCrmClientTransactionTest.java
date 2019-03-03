package com.amocrm.amocrmclient.transaction;


import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.transaction.entity.set.STResponseData;
import com.amocrm.amocrmclient.transaction.impl.TransactionClientBuilder;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;

public class AmoCrmClientTransactionTest extends AmoCrmClientTest {

    @SneakyThrows
    private TransactionClient getTransactionClient() {
        Properties properties = getProperties();

        return new TransactionClientBuilder()
                .baseUrl(properties.getProperty("amocrm.baseurl"))
                .login(properties.getProperty("amocrm.login"))
                .passwordHash(properties.getProperty("amocrm.passwordhash"))
                .build();
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testSetTransaction() throws IOException {

        TransactionClient transactionClient = getTransactionClient();
        Response<STResponseData> setTransactionResponse = transactionClient.setTransaction(100, 1L, 3453453);

        assertEquals(setTransactionResponse.body().response.transactions.add.transactions.size(), 0);
    }


}
