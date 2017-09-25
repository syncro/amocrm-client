package com.amocrm.amocrmclient.entity;


import java.util.List;

public class CustomField {

    public Long id;

    public String name;

    public List<CustomFieldValue> values;

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

    public List<CustomFieldValue> getValues() {
        return values;
    }

    public void setValues(List<CustomFieldValue> values) {
        this.values = values;
    }
}
