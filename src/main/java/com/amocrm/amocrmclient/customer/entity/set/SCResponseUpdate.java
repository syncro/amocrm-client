package com.amocrm.amocrmclient.customer.entity.set;


import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * /private/api/v2/json/customers/set -- $.response.customers.update
 */
public class SCResponseUpdate {
    /**
     * /private/api/v2/json/customers/set -- $.response.customers.update.customers
     */
    public Map<String, SCResponseAddCustomer> customers;

    public List<String> tags;

    @SerializedName("request_id")
    public Long requestId;

    public List<String> errors;

    public Map<String, SCResponseAddCustomer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<String, SCResponseAddCustomer> customers) {
        this.customers = customers;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
