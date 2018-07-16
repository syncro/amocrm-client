package com.amocrm.amocrmclient.lead.entity.list;


import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.entity.CustomField;
import com.amocrm.amocrmclient.entity.Tag;

import java.util.List;


/**
 * /private/api/v2/json/leads/list -- $.response.leads
 */
public class LLResponseLead {

    public String id;

    public String name;

    @SerializedName("last_modified")
    public int lastModified;

    @SerializedName("status_id")
    public String statusId;

    public String price;

    @SerializedName("responsible_user_id")
    public String responsibleUserId;

    // Long or false
    @SerializedName("main_contact_id")
    public Object mainContactId;

    public List<Tag> tags;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("account_id")
    public String accountId;

    @SerializedName("create_user_id")
    public String createUserId;


    @SerializedName("custom_fields")
    public List<CustomField> customFields;

    @SerializedName("data_close")
    public int dateClose;

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

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getResponsibleUserId() {
        return responsibleUserId;
    }

    public void setResponsibleUserId(String responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }

    public Object getMainContactId() {
        return mainContactId;
    }

    public void setMainContactId(Object mainContactId) {
        this.mainContactId = mainContactId;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public int getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(int dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    public int getDateClose() {
        return dateClose;
    }

    public void setDateClose(int dateClose) {
        this.dateClose = dateClose;
    }
}
