package com.amocrm.amocrmclient.customer.entity.set;


import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class SCResponseUpdate {

    public Map<String, SCResponseAddCustomer> customers;

    public List<String> tags;

    @SerializedName("request_id")
    public Long requestId;

    public List<String> errors;

}
