package com.amocrm.amocrmclient.company.entity.set;

import com.google.gson.annotations.SerializedName;


public class SCResponse {

    public SCResponseActions contacts;

    @SerializedName("server_time")
    public int serverTime;
}
