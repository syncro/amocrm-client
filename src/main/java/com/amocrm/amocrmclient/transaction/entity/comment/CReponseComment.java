package com.amocrm.amocrmclient.transaction.entity.comment;


import java.util.List;

/**
 * /private/api/v2/json/transactions/comment -- $.response.transactions.comment
 */
public class CReponseComment {
    /**
     * /private/api/v2/json/transactions/comment -- $.response.transactions.comment.transactions
     */
    public List<CResponseTransactionRequest> transactions;

    public List<String> errors;

    public List<CResponseTransactionRequest> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<CResponseTransactionRequest> transactions) {
        this.transactions = transactions;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
