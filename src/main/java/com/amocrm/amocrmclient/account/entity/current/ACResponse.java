package com.amocrm.amocrmclient.account.entity.current;


import com.google.gson.annotations.SerializedName;

public class ACResponse {

    public ACResponseAccount account;

    @SerializedName("server_time")
    public Long serverTime;

    public ACResponseAccount getAccount() {
        return account;
    }

    public void setAccount(ACResponseAccount account) {
        this.account = account;
    }

    public Long getServerTime() {
        return serverTime;
    }

    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }
}
