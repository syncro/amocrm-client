package com.amocrm.amocrmclient.customer.entity.set;


import com.google.gson.annotations.SerializedName;

/**
 * /private/api/v2/json/customers/set -- $.response
 */
public class SCResponse {
    /**
     * /private/api/v2/json/customers/set -- $.response.customers
     */
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
