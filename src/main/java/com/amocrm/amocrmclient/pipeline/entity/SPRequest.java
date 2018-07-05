package com.amocrm.amocrmclient.pipeline.entity;

import com.amocrm.amocrmclient.account.entity.Pipeline;

import java.util.List;
import java.util.Map;

public class SPRequest {

    public List<SPAdd> add;

    public Map<String, Pipeline> update;

    public List<SPAdd> getAdd() {
        return add;
    }

    public void setAdd(List<SPAdd> add) {
        this.add = add;
    }

    public Map<String, Pipeline> getUpdate() {
        return update;
    }

    public void setUpdate(Map<String, Pipeline> update) {
        this.update = update;
    }
}
