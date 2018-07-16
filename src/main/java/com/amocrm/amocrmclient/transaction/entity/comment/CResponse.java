package com.amocrm.amocrmclient.transaction.entity.comment;

/**
 * /private/api/v2/json/transactions/comment -- $.response
 */
public class CResponse {
    /**
     * /private/api/v2/json/transactions/comment -- $.response.transactions
     */
    public CResponseTransactions transactions;

    public CResponseTransactions getTransactions() {
        return transactions;
    }

    public void setTransactions(CResponseTransactions transactions) {
        this.transactions = transactions;
    }
}
