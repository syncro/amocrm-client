package com.amocrm.amocrmclient.customer.entity.set;


import java.util.List;

/**
 * /private/api/v2/json/customers/set -- $.response.customers.add
 */
public class SCResponseAdd {
    /**
     * /private/api/v2/json/customers/set -- $.response.customers.add.customers
     */
    public List<SCResponseAddCustomer> customers;

    public List<String> errors;

    public List<SCResponseAddCustomer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<SCResponseAddCustomer> customers) {
        this.customers = customers;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
