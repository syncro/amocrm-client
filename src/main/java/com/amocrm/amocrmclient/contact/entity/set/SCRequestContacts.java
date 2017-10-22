package com.amocrm.amocrmclient.contact.entity.set;


import java.util.List;

public class SCRequestContacts {

    public List<SCAdd> add;

    public List<SCUpdate> update;

    public List<SCAdd> getAdd() {
        return add;
    }

    public void setAdd(List<SCAdd> add) {
        this.add = add;
    }

    public List<SCUpdate> getUpdate() {
        return update;
    }

    public void setUpdate(List<SCUpdate> update) {
        this.update = update;
    }
}
