package com.amocrm.amocrmclient.lead.entity;


import com.amocrm.amocrmclient.response.Links;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * HAL API Lead Entity
 */
public class Lead {

    public Long id;

    public String name;

    @SerializedName("responsible_user_id")
    public Long responsibleUserId;

    @SerializedName("created_by")
    public Long createdBy;

    @SerializedName("created_at")
    public Long createdAt;

    @SerializedName("updated_at")
    public Long updatedAt;

    @SerializedName("account_id")
    public Long accountId;

    @SerializedName("is_deleted")
    public Boolean isDeleted;

    @SerializedName("main_contact")
    public MainContact mainContact;

    @SerializedName("group_id")
    public Long groupId;

    public Company company;

    @SerializedName("closed_at")
    public Long closedAt;

    @SerializedName("closest_task_at")
    public Long closedTaskAt;

    /**
     * api returns array or an empty object
     */
    public Object tags;

    public Collection<CustomField> customFields;

    public Contacts contacts;

    @SerializedName("status_id")
    public Long statusId;

    public BigDecimal sale;

    public Pipeline pipeline;

    @SerializedName("_links")
    public Links links;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public MainContact getMainContact() {
        return mainContact;
    }

    public void setMainContact(MainContact mainContact) {
        this.mainContact = mainContact;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Long getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Long closedAt) {
        this.closedAt = closedAt;
    }

    public Long getClosedTaskAt() {
        return closedTaskAt;
    }

    public void setClosedTaskAt(Long closedTaskAt) {
        this.closedTaskAt = closedTaskAt;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Collection<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Collection<CustomField> customFields) {
        this.customFields = customFields;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    public Pipeline getPipeline() {
        return pipeline;
    }

    public void setPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
