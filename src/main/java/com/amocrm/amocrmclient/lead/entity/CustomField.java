package com.amocrm.amocrmclient.lead.entity;


import com.google.gson.annotations.SerializedName;

import java.util.Collection;

public class CustomField {

    public Long id;

    public String name;

    public Collection<Value> values;

    @SerializedName("is_system")
    public Boolean isSystem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Value> getValues() {
        return values;
    }

    public void setValues(Collection<Value> values) {
        this.values = values;
    }

    public Boolean getSystem() {
        return isSystem;
    }

    public void setSystem(Boolean system) {
        isSystem = system;
    }
}
