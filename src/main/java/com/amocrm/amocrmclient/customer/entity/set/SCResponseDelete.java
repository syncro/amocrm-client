package com.amocrm.amocrmclient.customer.entity.set;


import java.util.List;
import java.util.Map;

/**
 * /private/api/v2/json/customers/set -- $.response.customers.delete
 */
public class SCResponseDelete {
    /**
     * /private/api/v2/json/customers/set -- $.response.customers.delete.customers
     */
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
