package com.amocrm.amocrmclient.entity.transaction;


import com.google.gson.annotations.SerializedName;

public class SetTransactionAddTransaction {

    public Long customerId;

    public int date;

    public int price;

    @SerializedName("next_price")
    public int nextPrice;

    @SerializedName("next_date")
    public int nextDate;
}
