package com.amocrm.amocrmclient.company.entity.set;

import com.google.gson.annotations.SerializedName;


public class SCResponse {

    public SCResponseActions contacts;

    @SerializedName("server_time")
    public int serverTime;

    public SCResponseActions getContacts() {
        return contacts;
    }

    public void setContacts(SCResponseActions contacts) {
        this.contacts = contacts;
    }

    public int getServerTime() {
        return serverTime;
    }

    public void setServerTime(int serverTime) {
        this.serverTime = serverTime;
    }
}
