package com.amocrm.amocrmclient.customer.entity.set;


import java.util.List;

public class SCRequestCustomers {

    public List<SCAdd> add;

    public List<SCAdd> update;

    public List<Long> delete;

    public List<SCAdd> getAdd() {
        return add;
    }

    public void setAdd(List<SCAdd> add) {
        this.add = add;
    }

    public List<SCAdd> getUpdate() {
        return update;
    }

    public void setUpdate(List<SCAdd> update) {
        this.update = update;
    }

    public List<Long> getDelete() {
        return delete;
    }

    public void setDelete(List<Long> delete) {
        this.delete = delete;
    }
}
