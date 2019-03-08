package com.amocrm.amocrmclient.lead.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class IncomingContact {

    public String name;

    @SerializedName("custom_fields")
    public Map<String, IncomingCustomField> customFields;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, IncomingCustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map<String, IncomingCustomField> customFields) {
        this.customFields = customFields;
    }
}
