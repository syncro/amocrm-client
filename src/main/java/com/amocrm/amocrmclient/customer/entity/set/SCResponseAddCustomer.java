package com.amocrm.amocrmclient.customer.entity.set;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * /private/api/v2/json/customers/list -- $.response.customers
 * /private/api/v2/json/customers/set -- $.response.customers.add.customers
 * /private/api/v2/json/customers/set -- $.response.customers.update.customers
 *
 */
public class SCResponseAddCustomer {

    public Long id;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("date_modify")
    public int dateModify;

    @SerializedName("created_by")
    public Long createdBy;

    @SerializedName("modified_by")
    public Long modifiedBy;

    @SerializedName("account_id")
    public Long accountId;

    @SerializedName("main_user_id")
    public Long mainUserId;

    public String name;

    public boolean deleted;

    @SerializedName("next_price")
    public int nextPrice;

    public int periodicity;

    @SerializedName("next_date")
    public int nextDate;

    @SerializedName("task_last_date")
    public int taskLastDate;

    @SerializedName("custom_fields")
    public List<SCResponseCustomField> customFields;

    public List<String> tags;

    @SerializedName("request_id")
    public Long requestId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(int dateCreate) {
        this.dateCreate = dateCreate;
    }

    public int getDateModify() {
        return dateModify;
    }

    public void setDateModify(int dateModify) {
        this.dateModify = dateModify;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getMainUserId() {
        return mainUserId;
    }

    public void setMainUserId(Long mainUserId) {
        this.mainUserId = mainUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getNextPrice() {
        return nextPrice;
    }

    public void setNextPrice(int nextPrice) {
        this.nextPrice = nextPrice;
    }

    public int getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    public int getNextDate() {
        return nextDate;
    }

    public void setNextDate(int nextDate) {
        this.nextDate = nextDate;
    }

    public int getTaskLastDate() {
        return taskLastDate;
    }

    public void setTaskLastDate(int taskLastDate) {
        this.taskLastDate = taskLastDate;
    }

    public List<SCResponseCustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<SCResponseCustomField> customFields) {
        this.customFields = customFields;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }
}
