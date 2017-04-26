package com.amocrm.amocrmclient.entity.transaction;


import com.google.gson.annotations.SerializedName;

public class SetTransactionResponseTransactionsSections {

    public SetTransactionResponseTransactionsSectionsAdd add;

    public SetTransactionResponseTransactionsSectionsDelete delete;

    @SerializedName("server_time")
    public int serverTime;
}
