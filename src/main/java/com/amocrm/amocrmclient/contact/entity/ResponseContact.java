package com.amocrm.amocrmclient.contact.entity;


import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.entity.CustomField;

import java.util.List;

/**
 * /private/api/v2/json/contacts/list -- $.response.contacts
 */
public class ResponseContact {

    public String id;

    public String name;

    @SerializedName("last_modified")
    public int lastModified;

    @SerializedName("account_id")
    public String accountId;

    @SerializedName("responsible_user_id")
    public String responsibleUserId;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("created_user_id")
    public String createdUserId;

    @SerializedName("linked_leads_id")
    public List<String> linkedLeadsId;

    public List<ContactTag> tags;

    public String type;

    @SerializedName("custom_fields")
    public List<CustomField> customFields;

    @SerializedName("server_time")
    public int serverTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLastModified() {
        return lastModified;
    }

    public void setLastModified(int lastModified) {
        this.lastModified = lastModified;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getResponsibleUserId() {
        return responsibleUserId;
    }

    public void setResponsibleUserId(String responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }

    public int getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(int dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public List<String> getLinkedLeadsId() {
        return linkedLeadsId;
    }

    public void setLinkedLeadsId(List<String> linkedLeadsId) {
        this.linkedLeadsId = linkedLeadsId;
    }

    public List<ContactTag> getTags() {
        return tags;
    }

    public void setTags(List<ContactTag> tags) {
        this.tags = tags;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    public int getServerTime() {
        return serverTime;
    }

    public void setServerTime(int serverTime) {
        this.serverTime = serverTime;
    }
}
