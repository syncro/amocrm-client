package com.amocrm.amocrmclient.account.entity.current;


import com.google.gson.annotations.SerializedName;

public class ACResponse {

    public ACResponseAccount account;

    @SerializedName("server_time")
    public Long serverTime;
}
