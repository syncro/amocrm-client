package com.amocrm.amocrmclient.transaction;


import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.transaction.entity.set.STResponseData;

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
    public void testSetTransaction() {

        TransactionClient transactionClient = getTransactionClient();
        Response<STResponseData> setTransactionResponse = null;
        try {
            setTransactionResponse = transactionClient.setTransaction(100, 1L, 3453453);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(setTransactionResponse.body().response.transactions.add.transactions.size(), 0);
    }


}
