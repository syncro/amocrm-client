package com.amocrm.amocrmclient.entity.transaction.comment;


import com.google.gson.annotations.SerializedName;

public class CRequestUpdate {

    @SerializedName("transaction_id")
    public Long transactionId;

    public String comment;
}
