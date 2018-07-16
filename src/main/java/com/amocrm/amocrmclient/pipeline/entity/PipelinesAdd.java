package com.amocrm.amocrmclient.pipeline.entity;

import com.amocrm.amocrmclient.account.entity.Pipeline;

import java.util.Map;

/**
 * /private/api/v2/json/pipelines/set -- $.response.pipelines.add
 */
public class PipelinesAdd {
    /**
     * /private/api/v2/json/pipelines/set -- $.response.pipelines.add.pipelines
     */
    public Map<String, Pipeline> pipelines;

    public Map<String, Pipeline> getPipelines() {
        return pipelines;
    }

    public void setPipelines(Map<String, Pipeline> pipelines) {
        this.pipelines = pipelines;
    }
}
