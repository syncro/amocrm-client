package com.amocrm.amocrmclient.pipeline.entity;

import java.util.Map;

/**
 * /private/api/v2/json/pipelines/set -- $.response.pipelines
 */
public class SPResPipelines {
    /**
     * /private/api/v2/json/pipelines/set -- $.response.pipelines.add
     */
    public PipelinesAdd add;
    /**
     * /private/api/v2/json/pipelines/set -- $.response.pipelines.update
     */
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
