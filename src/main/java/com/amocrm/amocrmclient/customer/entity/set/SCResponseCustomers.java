package com.amocrm.amocrmclient.customer.entity.set;

/**
 * /private/api/v2/json/customers/set -- $.response.customers
 */
public class SCResponseCustomers {
    /**
     * /private/api/v2/json/customers/set -- $.response.customers.delete
     */
    public SCResponseDelete delete;
    /**
     * /private/api/v2/json/customers/set -- $.response.customers.add
     */
    public SCResponseAdd add;
    /**
     * /private/api/v2/json/customers/set -- $.response.customers.update
     */
    public SCResponseUpdate update;

    public SCResponseDelete getDelete() {
        return delete;
    }

    public void setDelete(SCResponseDelete delete) {
        this.delete = delete;
    }

    public SCResponseAdd getAdd() {
        return add;
    }

    public void setAdd(SCResponseAdd add) {
        this.add = add;
    }

    public SCResponseUpdate getUpdate() {
        return update;
    }

    public void setUpdate(SCResponseUpdate update) {
        this.update = update;
    }
}
