package com.amocrm.amocrmclient.lead.entity;

import com.google.gson.annotations.SerializedName;

public class AcceptIncLead {

    public String[] accept;

    @SerializedName("userId")
    public Long user_id;

    public String[] getAccept() {
        return accept;
    }

    public void setAccept(String[] accept) {
        this.accept = accept;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
