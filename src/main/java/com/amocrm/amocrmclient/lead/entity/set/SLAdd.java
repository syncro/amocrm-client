package com.amocrm.amocrmclient.lead.entity.set;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;



public class SLAdd {

    public String name;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("last_modified")
    public int lastModified;

    @SerializedName("status_id")
    public Long statusId;

    @SerializedName("price")
    public BigDecimal price;

    @SerializedName("responsible_user_id")
    public Long responsibleUserId;

    public String tags;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getResponsibleUserId() {
        return responsibleUserId;
    }

    public void setResponsibleUserId(Long responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
