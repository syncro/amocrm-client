package com.amocrm.amocrmclient.note.entity;


import com.amocrm.amocrmclient.response.Links;
import com.google.gson.annotations.SerializedName;


/**
 * HAL API Note Entity
 */
public class Note {

    public Long id;

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

    @SerializedName("group_id")
    public Long groupId;

    @SerializedName("is_editable")
    public boolean isEditable;

    @SerializedName("element_id")
    public Long elementId;

    @SerializedName("element_type")
    public Integer elementType;

    public String attachment;

    @SerializedName("node_type")
    public Integer nodeType;

    public String text;

    @SerializedName("_links")
    public Links links;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public boolean isEditable() {
        return isEditable;
    }

    public void setEditable(boolean editable) {
        isEditable = editable;
    }

    public Long getElementId() {
        return elementId;
    }

    public void setElementId(Long elementId) {
        this.elementId = elementId;
    }

    public Integer getElementType() {
        return elementType;
    }

    public void setElementType(Integer elementType) {
        this.elementType = elementType;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
