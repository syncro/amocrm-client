package com.amocrm.amocrmclient.lead.entity;

import com.google.gson.annotations.SerializedName;

public class AcceptIncLeadRequest {

    public String[] accept;

    @SerializedName("user_id")
    public String userId;

    @SerializedName("status_id")
    public String statusId;

    public String[] getAccept() {
        return accept;
    }

    public void setAccept(String[] accept) {
        this.accept = accept;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
}
