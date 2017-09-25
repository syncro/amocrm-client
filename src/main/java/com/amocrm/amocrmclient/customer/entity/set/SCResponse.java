package com.amocrm.amocrmclient.customer.entity.set;


import com.google.gson.annotations.SerializedName;

public class SCResponse {

    public SCResponseCustomers customers;

    @SerializedName("server_time")
    public int serverTime;

    public SCResponseCustomers getCustomers() {
        return customers;
    }

    public void setCustomers(SCResponseCustomers customers) {
        this.customers = customers;
    }

    public int getServerTime() {
        return serverTime;
    }

    public void setServerTime(int serverTime) {
        this.serverTime = serverTime;
    }
}
