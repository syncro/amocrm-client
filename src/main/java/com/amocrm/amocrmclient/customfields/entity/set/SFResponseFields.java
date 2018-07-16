package com.amocrm.amocrmclient.customfields.entity.set;

import java.util.List;

/**
 * /private/api/v2/json/fields/set -- $.response.fields
 */
public class SFResponseFields {
    /**
     * /private/api/v2/json/fields/set -- $.response.fields.add
     */
    public List<SFResponseAdd> add;

    public List<SFResponseAdd> getAdd() {
        return add;
    }

    public void setAdd(List<SFResponseAdd> add) {
        this.add = add;
    }
}
