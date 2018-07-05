package com.amocrm.amocrmclient.pipeline.entity;

import com.amocrm.amocrmclient.account.entity.Pipeline;

import java.util.Map;

public class PipelinesAdd {

    public Map<String, Pipeline> pipelines;

    public Map<String, Pipeline> getPipelines() {
        return pipelines;
    }

    public void setPipelines(Map<String, Pipeline> pipelines) {
        this.pipelines = pipelines;
    }
}
