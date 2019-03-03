package com.amocrm.amocrmclient.lead.entity;

import com.google.gson.annotations.SerializedName;

public class Value {

    public String value;

    @SerializedName("enum")
    public String enumeration;

    public String subtype;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(String enumeration) {
        this.enumeration = enumeration;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }


}
