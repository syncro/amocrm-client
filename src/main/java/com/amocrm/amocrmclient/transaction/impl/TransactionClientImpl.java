package com.amocrm.amocrmclient.transaction.impl;


import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.transaction.entity.set.STAddTransaction;
import com.amocrm.amocrmclient.transaction.entity.set.STParameter;
import com.amocrm.amocrmclient.transaction.entity.set.STRequest;
import com.amocrm.amocrmclient.transaction.entity.set.STResponseData;
import com.amocrm.amocrmclient.transaction.entity.set.STTransactions;
import com.amocrm.amocrmclient.iface.ITransactionAPI;
import com.amocrm.amocrmclient.transaction.TransactionClient;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Response;

class TransactionClientImpl implements TransactionClient, WithAuthClient {

    private AuthClient authClient;

    private ITransactionAPI transactionAPI;

    public TransactionClientImpl(AuthClient authClient, ITransactionAPI transactionAPI) {
        this.authClient = authClient;
        this.transactionAPI = transactionAPI;
    }

    public ITransactionAPI api() {
        return transactionAPI;
    }

    public STParameter createTransaction(int price, long customerId, long date) {

        STParameter setTransaction = new STParameter();
        setTransaction.request = new STRequest();
        setTransaction.request.transactions = new STTransactions();
        setTransaction.request.transactions.add = new ArrayList<>();
        STAddTransaction setTransactionAdd = new STAddTransaction();
        setTransactionAdd.price = price;
        setTransactionAdd.customerId = customerId;
        setTransactionAdd.date = date;
        setTransaction.request.transactions.add.add(setTransactionAdd);

        return setTransaction;

    }

    public Response<STResponseData> setTransaction(int price, long customerId, long date) throws IOException {

        STParameter setTransation = createTransaction(price, customerId, date);

        return setTransaction(setTransation);

    }

    public Response<STResponseData> setTransaction(STParameter setTransaction) throws IOException {

        return transactionAPI.setTransaction(setTransaction).execute();

    }

    @Override
    public AuthClient getAuthClient() {

        return authClient;

    }
}
