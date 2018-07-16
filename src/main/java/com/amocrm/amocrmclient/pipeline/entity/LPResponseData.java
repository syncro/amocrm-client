package com.amocrm.amocrmclient.pipeline.entity;

import com.amocrm.amocrmclient.account.entity.Pipeline;

import java.util.Map;

/**
 * /private/api/v2/json/pipelines/list -- $.
 */
public class LPResponseData {
    /**
     * /private/api/v2/json/pipelines/list -- $.pipelines
     */
    public Map<String, Pipeline> pipelines;

    public Map<String, Pipeline> getPipelines() {
        return pipelines;
    }

    public void setPipelines(Map<String, Pipeline> pipelines) {
        this.pipelines = pipelines;
    }
}
