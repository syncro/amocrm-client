package com.amocrm.amocrmclient.transaction.entity.comment;


import com.google.gson.annotations.SerializedName;

public class CRequestUpdate {

    @SerializedName("transaction_id")
    public Long transactionId;

    public String comment;
}
