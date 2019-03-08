package com.amocrm.amocrmclient.lead.entity;

import com.amocrm.amocrmclient.response.Links;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class IncLeadResponse {

    public String status;

    public Map<String, AcceptIncLeadEntry> data;

    @SerializedName("_links")
    public Links links;

    public String error;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, AcceptIncLeadEntry> getData() {
        return data;
    }

    public void setData(Map<String, AcceptIncLeadEntry> data) {
        this.data = data;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
