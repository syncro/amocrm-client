package com.amocrm.amocrmclient.entity;


import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.account.entity.AmoCrmAccount;

import java.util.List;

public class AuthResponseData {

    public boolean auth;

    public List<AmoCrmAccount> accounts;

    public AmoCrmUser user;

    @SerializedName("server_time")
    public int serverTime;

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    public List<AmoCrmAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AmoCrmAccount> accounts) {
        this.accounts = accounts;
    }

    public AmoCrmUser getUser() {
        return user;
    }

    public void setUser(AmoCrmUser user) {
        this.user = user;
    }

    public int getServerTime() {
        return serverTime;
    }

    public void setServerTime(int serverTime) {
        this.serverTime = serverTime;
    }
}
