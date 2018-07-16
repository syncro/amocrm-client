package com.amocrm.amocrmclient.customer.entity.list;


import com.amocrm.amocrmclient.customer.entity.set.SCResponseAddCustomer;

import java.util.List;

/**
 * /private/api/v2/json/customers/list -- $.response
 */
public class LCResponse {
    /**
     * /private/api/v2/json/customers/list -- $.response.customers
     */
    public List<SCResponseAddCustomer> customers;

    public List<SCResponseAddCustomer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<SCResponseAddCustomer> customers) {
        this.customers = customers;
    }
}
