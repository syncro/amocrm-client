package com.amocrm.amocrmclient.pipeline.entity;

import java.util.Map;

public class SPAdd {

    public String name;

    public Map<String, SPStatus> add;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, SPStatus> getAdd() {
        return add;
    }

    public void setAdd(Map<String, SPStatus> add) {
        this.add = add;
    }
}
