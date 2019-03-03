package com.amocrm.amocrmclient.task.entity;

import com.google.gson.annotations.SerializedName;

public class Task {

    public Long id;

    @SerializedName("element_id")
    public Long elementId;

    /**
     * The type of the element to be attached (1-contact, 2-lead, 3-company, 12-customer)
     */
    @SerializedName("element_type")
    public Long elementType;

    @SerializedName("complete_till_at")
    public Long completeTillAt;

    @SerializedName("task_type")
    public Long taskType;

    public String text;

    @SerializedName("created_at")
    public Long createdAt;

    @SerializedName("updated_at")
    public Long updatedAt;

    @SerializedName("responsible_user_id")
    public Long responsibleUserId;

    @SerializedName("is_completed")
    public Long isCompleted;

    @SerializedName("created_by")
    public Long createdBy;

    @SerializedName("account_id")
    public Long accountId;

    @SerializedName("group_id")
    public Long groupId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getElementId() {
        return elementId;
    }

    public void setElementId(Long elementId) {
        this.elementId = elementId;
    }

    public Long getElementType() {
        return elementType;
    }

    public void setElementType(Long elementType) {
        this.elementType = elementType;
    }

    public Long getCompleteTillAt() {
        return completeTillAt;
    }

    public void setCompleteTillAt(Long completeTillAt) {
        this.completeTillAt = completeTillAt;
    }

    public Long getTaskType() {
        return taskType;
    }

    public void setTaskType(Long taskType) {
        this.taskType = taskType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Long getResponsibleUserId() {
        return responsibleUserId;
    }

    public void setResponsibleUserId(Long responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }

    public Long getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Long isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
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
}
