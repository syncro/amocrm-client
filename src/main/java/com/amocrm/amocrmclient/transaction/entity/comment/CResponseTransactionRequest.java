package com.amocrm.amocrmclient.transaction.entity.comment;


import com.google.gson.annotations.SerializedName;

/**
 * /private/api/v2/json/transactions/comment -- $.response.transactions.comment.transactions
 */
public class CResponseTransactionRequest {

    @SerializedName("request_id")
    public Long requestId;
    /**
     * /private/api/v2/json/transactions/comment -- $.response.transactions.comment.transactions.transaction
     */
    public CResponseTransaction transaction;

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public CResponseTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(CResponseTransaction transaction) {
        this.transaction = transaction;
    }
}
