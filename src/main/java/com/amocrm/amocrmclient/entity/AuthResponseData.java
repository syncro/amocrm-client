package com.amocrm.amocrmclient.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AuthResponseData {

    public boolean auth;

    public List<AmoCrmAccount> accounts;

    public AmoCrmUser user;

    @SerializedName("server_time")
    public int serverTime;
}
