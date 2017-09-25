package com.amocrm.amocrmclient.company.entity.set;

import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.entity.CustomField;

import java.util.List;

public class SCRequestAdd {

    public String name;

    @SerializedName("request_id")
    public Long requestId;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("last_modified")
    public int lastModified;


    @SerializedName("responsible_user_id")
    public String responsibleUserId;

    @SerializedName("linked_leads_id")
    public List<Long> linkedLeadsId;

    public String tags;

    @SerializedName("custom_fields")
    public List<CustomField> customFields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public int getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(int dateCreate) {
        this.dateCreate = dateCreate;
    }

    public int getLastModified() {
        return lastModified;
    }

    public void setLastModified(int lastModified) {
        this.lastModified = lastModified;
    }

    public String getResponsibleUserId() {
        return responsibleUserId;
    }

    public void setResponsibleUserId(String responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }

    public List<Long> getLinkedLeadsId() {
        return linkedLeadsId;
    }

    public void setLinkedLeadsId(List<Long> linkedLeadsId) {
        this.linkedLeadsId = linkedLeadsId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }
}
