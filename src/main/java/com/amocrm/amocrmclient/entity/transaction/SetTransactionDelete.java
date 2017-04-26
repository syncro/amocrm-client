package com.amocrm.amocrmclient.entity.transaction;


import com.google.gson.annotations.SerializedName;

public class SetTransactionDelete {

    public Long id;

    public int date;

    public int price;

    @SerializedName("customer_id")
    public Long customerId;
}
