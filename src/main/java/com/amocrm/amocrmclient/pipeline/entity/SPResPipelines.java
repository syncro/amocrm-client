package com.amocrm.amocrmclient.pipeline.entity;

import java.util.Map;

public class SPResPipelines {

    public PipelinesAdd add;

    public Map<String, Boolean> update;

    public PipelinesAdd getAdd() {
        return add;
    }

    public void setAdd(PipelinesAdd add) {
        this.add = add;
    }

    public Map<String, Boolean> getUpdate() {
        return update;
    }

    public void setUpdate(Map<String, Boolean> update) {
        this.update = update;
    }
}
