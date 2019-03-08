package com.amocrm.amocrmclient.lead.entity;

import com.google.gson.annotations.SerializedName;

public class IncomingLead {

    public String category;

    public String uid;

    @SerializedName("source_name")
    public String sourceName;

    @SerializedName("created_at")
    public Long createdAt;

    @SerializedName("incoming_lead_info")
    public IncomingLeadInfo incomingLeadInfo;

    @SerializedName("incoming_entities")
    public IncomingEntitesRes incomingEntites;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public IncomingLeadInfo getIncomingLeadInfo() {
        return incomingLeadInfo;
    }

    public void setIncomingLeadInfo(IncomingLeadInfo incomingLeadInfo) {
        this.incomingLeadInfo = incomingLeadInfo;
    }

    public IncomingEntitesRes getIncomingEntites() {
        return incomingEntites;
    }

    public void setIncomingEntites(IncomingEntitesRes incomingEntites) {
        this.incomingEntites = incomingEntites;
    }
}
