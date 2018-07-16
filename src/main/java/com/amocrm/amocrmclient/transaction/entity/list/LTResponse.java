package com.amocrm.amocrmclient.transaction.entity.list;


import java.util.Map;

/**
 * /private/api/v2/json/transactions/list -- $.response
 */
public class LTResponse {
    /**
     * /private/api/v2/json/transactions/list -- $.response.transactions
     */
    public Map<String, LTTransaction> transactions;

    public Map<String, LTTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Map<String, LTTransaction> transactions) {
        this.transactions = transactions;
    }
}
