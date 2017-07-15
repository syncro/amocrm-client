package com.amocrm.amocrmclient.entity.transaction.set;


import com.google.gson.annotations.SerializedName;

public class STResponseTransactions {

    public STResponseAdd add;

    public STResponseDelete delete;

    @SerializedName("server_time")
    public int serverTime;
}
