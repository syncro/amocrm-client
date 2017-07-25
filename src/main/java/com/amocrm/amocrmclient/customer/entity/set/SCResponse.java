package com.amocrm.amocrmclient.customer.entity.set;


import com.google.gson.annotations.SerializedName;

public class SCResponse {

    public SCResponseCustomers customers;

    @SerializedName("server_time")
    public int serverTime;
}
