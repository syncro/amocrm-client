package com.amocrm.amocrmclient.transaction.entity.comment;

/**
 * /private/api/v2/json/transactions/comment -- $.response.transactions
 */
public class CResponseTransactions {
    /**
     * /private/api/v2/json/transactions/comment -- $.response.transactions.comment
     */
    public CReponseComment comment;

    public CReponseComment getComment() {
        return comment;
    }

    public void setComment(CReponseComment comment) {
        this.comment = comment;
    }
}
