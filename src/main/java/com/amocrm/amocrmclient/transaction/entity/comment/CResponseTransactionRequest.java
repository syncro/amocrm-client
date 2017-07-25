package com.amocrm.amocrmclient.transaction.entity.comment;


import com.google.gson.annotations.SerializedName;

public class CResponseTransactionRequest {

    @SerializedName("request_id")
    public Long requestId;

    public CResponseTransaction transaction;
}
