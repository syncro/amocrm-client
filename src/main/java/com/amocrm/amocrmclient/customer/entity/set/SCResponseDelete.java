package com.amocrm.amocrmclient.customer.entity.set;


import java.util.List;
import java.util.Map;

public class SCResponseDelete {

    public Map<String, SCResponseDeleteCustomer> customers;

    public List<String> errors;

    public Map<String, SCResponseDeleteCustomer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<String, SCResponseDeleteCustomer> customers) {
        this.customers = customers;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
