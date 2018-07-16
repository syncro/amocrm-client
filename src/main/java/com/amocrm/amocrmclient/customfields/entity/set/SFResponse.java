package com.amocrm.amocrmclient.customfields.entity.set;

/**
 * /private/api/v2/json/fields/set -- $.response
 */
public class SFResponse {
    /**
     * /private/api/v2/json/fields/set -- $.response.fields
     */
    public SFResponseFields fields;

    public SFResponseFields getFields() {
        return fields;
    }

    public void setFields(SFResponseFields fields) {
        this.fields = fields;
    }
}
