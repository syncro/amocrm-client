package com.amocrm.amocrmclient.customer.entity.list;


import com.amocrm.amocrmclient.customer.entity.set.SCResponseAddCustomer;

import java.util.List;

public class LCResponse {

    public List<SCResponseAddCustomer> customers;

    public List<SCResponseAddCustomer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<SCResponseAddCustomer> customers) {
        this.customers = customers;
    }
}
