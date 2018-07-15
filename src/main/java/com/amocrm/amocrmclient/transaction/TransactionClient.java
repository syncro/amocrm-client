package com.amocrm.amocrmclient.transaction;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.transaction.entity.set.STParameter;
import com.amocrm.amocrmclient.transaction.entity.set.STResponseData;
import com.amocrm.amocrmclient.iface.ITransactionAPI;

import java.io.IOException;

import retrofit2.Response;


public interface TransactionClient {

    ITransactionAPI api();

    STParameter createTransaction(int price, long customerId, long date);

    Response<STResponseData> setTransaction(int price, long customerId, long date) throws IOException;

    @AuthWithClient
    Response<STResponseData> setTransaction(STParameter setTransaction) throws IOException;

}
