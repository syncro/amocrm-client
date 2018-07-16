package com.amocrm.amocrmclient.transaction.entity.comment;


import com.google.gson.annotations.SerializedName;

/**
 * /private/api/v2/json/transactions/comment -- $.response.transactions.comment.transactions.transaction
 */
public class CResponseTransaction {

    public Long id;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("date_modify")
    public int dateModify;

    @SerializedName("created_by")
    public int createdBy;

    @SerializedName("modified_by")
    public int modifiedBy;

    @SerializedName("account_id")
    public Long accountId;

    @SerializedName("customer_id")
    public Long customerId;

    public boolean deleted;

    public int price;

    public String comment;

    public int date;

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

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
