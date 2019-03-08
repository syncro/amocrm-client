package com.amocrm.amocrmclient.lead.entity;

import com.google.gson.annotations.SerializedName;

public class IncomingLeadAdd {

    @SerializedName("source_name")
    public Long sourceName;

    @SerializedName("source_uid")
    public Long sourceUid;

    @SerializedName("created_at")
    public Long createdAt;

    @SerializedName("pipeline_id")
    public Long pipelineId;

    @SerializedName("incoming_entities")
    public IncomingEntities incomingEntities;

    public Long getSourceName() {
        return sourceName;
    }

    public void setSourceName(Long sourceName) {
        this.sourceName = sourceName;
    }

    public Long getSourceUid() {
        return sourceUid;
    }

    public void setSourceUid(Long sourceUid) {
        this.sourceUid = sourceUid;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
    }

    public IncomingEntities getIncomingEntities() {
        return incomingEntities;
    }

    public void setIncomingEntities(IncomingEntities incomingEntities) {
        this.incomingEntities = incomingEntities;
    }
}
