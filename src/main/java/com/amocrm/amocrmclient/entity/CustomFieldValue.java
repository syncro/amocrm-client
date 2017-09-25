package com.amocrm.amocrmclient.entity;


import com.google.gson.annotations.SerializedName;

public class CustomFieldValue {

    public String value;

    @SerializedName("enum")
    public String enumer;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getEnumer() {
        return enumer;
    }

    public void setEnumer(String enumer) {
        this.enumer = enumer;
    }
}
