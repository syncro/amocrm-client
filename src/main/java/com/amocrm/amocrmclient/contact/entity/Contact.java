package com.amocrm.amocrmclient.contact.entity;


import com.amocrm.amocrmclient.lead.entity.CustomField;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;

/**
 * HAL API Lead Entity
 */
public class Contact {

    public String id;

    public String name;

    @SerializedName("responsible_user_id")
    public Long responsibleUserId;

    @SerializedName("created_by")
    public Long createdBy;

    @SerializedName("created_at")
    public Long createdAt;

    /**
     * api returns array or an empty object
     */
    public Object tags;

    @SerializedName("leads_id")
    public String leadsId;

    @SerializedName("company_id")
    public String companyId;

    @SerializedName("custom_fields")
    public Collection<CustomField> customFields;

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

    public Long getResponsibleUserId() {
        return responsibleUserId;
    }

    public void setResponsibleUserId(Long responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getLeadsId() {
        return leadsId;
    }

    public void setLeadsId(String leadsId) {
        this.leadsId = leadsId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Collection<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Collection<CustomField> customFields) {
        this.customFields = customFields;
    }
}
