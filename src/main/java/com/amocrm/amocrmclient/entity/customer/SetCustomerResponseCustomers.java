package com.amocrm.amocrmclient.entity.customer;


import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.entity.lead.AddReadResponseLeads;

public class SetCustomerResponseCustomers {

    public SetCustomerResponseCustomersSections customers;

    @SerializedName("server_time")
    public int serverTime;
}
