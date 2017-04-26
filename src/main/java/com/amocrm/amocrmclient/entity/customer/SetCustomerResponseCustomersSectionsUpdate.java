package com.amocrm.amocrmclient.entity.customer;


import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class SetCustomerResponseCustomersSectionsUpdate {

    public Map<String, SetCustomerResponseCustomersCustomer> customers;

    public List<String> tags;

    @SerializedName("request_id")
    public Long requestId;

    public List<String> errors;

}
