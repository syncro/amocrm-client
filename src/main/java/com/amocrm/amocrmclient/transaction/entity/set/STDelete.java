package com.amocrm.amocrmclient.transaction.entity.set;


import com.google.gson.annotations.SerializedName;

public class STDelete {

    public Long id;

    public int date;

    public int price;

    @SerializedName("customer_id")
    public Long customerId;
}
