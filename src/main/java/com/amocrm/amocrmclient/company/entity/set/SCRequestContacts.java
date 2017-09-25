package com.amocrm.amocrmclient.company.entity.set;


import java.util.List;

public class SCRequestContacts {

    public List<SCRequestAdd> add;

    public List<SCRequestAdd> update;

    public List<SCRequestAdd> getAdd() {
        return add;
    }

    public void setAdd(List<SCRequestAdd> add) {
        this.add = add;
    }

    public List<SCRequestAdd> getUpdate() {
        return update;
    }

    public void setUpdate(List<SCRequestAdd> update) {
        this.update = update;
    }
}
