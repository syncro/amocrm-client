package com.amocrm.amocrmclient.transaction.entity.set;


import com.google.gson.annotations.SerializedName;

public class STAddTransaction {

    @SerializedName("customer_id")
    public Long customerId;

    public long date;

    public long price;

    @SerializedName("next_price")
    public int nextPrice;

    @SerializedName("next_date")
    public int nextDate;
}
