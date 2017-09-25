package com.amocrm.amocrmclient.company.entity.set;

import java.util.List;

public class SCResponseActions {

    public List<SCResponseAdd> add;

    public List<SCResponseAdd> update;

    public List<SCResponseAdd> getAdd() {
        return add;
    }

    public void setAdd(List<SCResponseAdd> add) {
        this.add = add;
    }

    public List<SCResponseAdd> getUpdate() {
        return update;
    }

    public void setUpdate(List<SCResponseAdd> update) {
        this.update = update;
    }
}
