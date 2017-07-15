package com.amocrm.amocrmclient.entity.transaction.set;


import com.google.gson.annotations.SerializedName;

public class STDelete {

    public Long id;

    public int date;

    public int price;

    @SerializedName("customer_id")
    public Long customerId;
}
