package com.amocrm.amocrmclient.customer.entity.set;


public class SCResponseCustomers {

    public SCResponseDelete delete;

    public SCResponseAdd add;

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
