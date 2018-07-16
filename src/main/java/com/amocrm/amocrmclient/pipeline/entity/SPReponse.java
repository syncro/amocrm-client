package com.amocrm.amocrmclient.pipeline.entity;

/**
 * /private/api/v2/json/pipelines/set -- $.response
 */
public class SPReponse {
    /**
     * /private/api/v2/json/pipelines/set -- $.response.pipelines
     */
    public SPResPipelines pipelines;

    public SPResPipelines getPipelines() {
        return pipelines;
    }

    public void setPipelines(SPResPipelines pipelines) {
        this.pipelines = pipelines;
    }

}
