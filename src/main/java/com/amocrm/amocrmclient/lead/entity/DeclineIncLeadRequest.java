package com.amocrm.amocrmclient.lead.entity;

import com.google.gson.annotations.SerializedName;

public class DeclineIncLeadRequest {

    public String[] decline;

    @SerializedName("user_id")
    public String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
