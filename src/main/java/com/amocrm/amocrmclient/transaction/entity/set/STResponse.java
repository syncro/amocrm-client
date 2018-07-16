package com.amocrm.amocrmclient.transaction.entity.set;

/**
 * /private/api/v2/json/transactions/set -- $.response
 */
public class STResponse {
    /**
     * /private/api/v2/json/transactions/set -- $.response.transactions
     */
    public STResponseTransactions transactions;

    public STResponseTransactions getTransactions() {
        return transactions;
    }

    public void setTransactions(STResponseTransactions transactions) {
        this.transactions = transactions;
    }
}
