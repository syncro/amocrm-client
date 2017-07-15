package com.amocrm.amocrmclient.entity.account.current;


import com.google.gson.annotations.SerializedName;

public class ACResponse {

    public ACResponseAccount account;

    @SerializedName("server_time")
    public Long serverTime;
}
