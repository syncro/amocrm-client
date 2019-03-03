package com.amocrm.amocrmclient.response;

import com.google.gson.annotations.SerializedName;

public class ResponseItem {

    public Long id;

    @SerializedName("request_id")
    public Long requestId;

    @SerializedName("_links")
    public Links links;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
