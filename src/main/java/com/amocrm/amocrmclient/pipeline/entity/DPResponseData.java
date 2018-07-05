package com.amocrm.amocrmclient.pipeline.entity;

import java.util.Map;

public class DPResponseData {

    public Map<Long, Object> response;

    public Map<Long, Object> getResponse() {
        return response;
    }

    public void setResponse(Map<Long, Object> response) {
        this.response = response;
    }
}
