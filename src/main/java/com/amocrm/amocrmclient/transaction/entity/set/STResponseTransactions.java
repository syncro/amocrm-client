package com.amocrm.amocrmclient.transaction.entity.set;


import com.google.gson.annotations.SerializedName;

/**
 * /private/api/v2/json/transactions/set -- $.response.transactions
 */
public class STResponseTransactions {
    /**
     * /private/api/v2/json/transactions/set -- $.response.transactions.add
     */
    public STResponseAdd add;
    /**
     * /private/api/v2/json/transactions/set -- $.response.transactions.delete
     */
    public STResponseDelete delete;

    @SerializedName("server_time")
    public int serverTime;

    public STResponseAdd getAdd() {
        return add;
    }

    public void setAdd(STResponseAdd add) {
        this.add = add;
    }

    public STResponseDelete getDelete() {
        return delete;
    }

    public void setDelete(STResponseDelete delete) {
        this.delete = delete;
    }

    public int getServerTime() {
        return serverTime;
    }

    public void setServerTime(int serverTime) {
        this.serverTime = serverTime;
    }
}
