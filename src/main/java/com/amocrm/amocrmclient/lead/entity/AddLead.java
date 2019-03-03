package com.amocrm.amocrmclient.lead.entity;

import java.util.Collection;

/**
 * HAL API AddLead Entity
 */
public class AddLead {

    public Collection<Lead> add;

    public Collection<Lead> update;

    public Collection<Lead> getAdd() {
        return add;
    }

    public void setAdd(Collection<Lead> add) {
        this.add = add;
    }

    public Collection<Lead> getUpdate() {
        return update;
    }

    public void setUpdate(Collection<Lead> update) {
        this.update = update;
    }
}
