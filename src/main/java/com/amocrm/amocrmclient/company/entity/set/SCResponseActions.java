package com.amocrm.amocrmclient.company.entity.set;

import java.util.List;

/**
 * /private/api/v2/json/contacts/set -- $.response.actions
 */
public class SCResponseActions {
    /**
     * /private/api/v2/json/contacts/set -- $.response.actions.add
     */
    public List<SCResponseAdd> add;
    /**
     * /private/api/v2/json/contacts/set -- $.response.actions.update
     */
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
