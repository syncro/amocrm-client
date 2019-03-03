package com.amocrm.amocrmclient.request;


import java.util.Collection;

/**
 * HAL API Add or Update Entity
 */
public class AddOrUpdate<AddEntity> {

    public Collection<AddEntity> add;

    public Collection<AddEntity> update;

    public Collection<AddEntity> getAdd() {
        return add;
    }

    public void setAdd(Collection<AddEntity> add) {
        this.add = add;
    }

    public Collection<AddEntity> getUpdate() {
        return update;
    }

    public void setUpdate(Collection<AddEntity> update) {
        this.update = update;
    }
}
