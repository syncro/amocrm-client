package com.amocrm.amocrmclient.transaction.entity;


import com.google.gson.annotations.SerializedName;

public class TransactionResponseError {
    public Long id;

    public String code;

    public String message;

    @SerializedName("request_id")
    public Long requestId;

}
