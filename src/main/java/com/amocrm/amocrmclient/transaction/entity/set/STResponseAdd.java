package com.amocrm.amocrmclient.transaction.entity.set;


import com.amocrm.amocrmclient.transaction.entity.TransactionResponseError;

import java.util.List;

/**
 * /private/api/v2/json/transactions/set -- $.response.transactions.add
 */
public class STResponseAdd {
    /**
     * /private/api/v2/json/transactions/set -- $.response.transactions.transactions
     */
    public List<STAdd> transactions;
    /**
     * /private/api/v2/json/transactions/set -- $.response.transactions.errors
     */
    public List<TransactionResponseError> errors;

    public List<STAdd> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<STAdd> transactions) {
        this.transactions = transactions;
    }

    public List<TransactionResponseError> getErrors() {
        return errors;
    }

    public void setErrors(List<TransactionResponseError> errors) {
        this.errors = errors;
    }
}
