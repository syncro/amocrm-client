package com.amocrm.amocrmclient.entity.account;


import com.google.gson.annotations.SerializedName;

public class AccountsDataAccountResponse {

    public AccountsDataAccount account;

    @SerializedName("server_time")
    public Long serverTime;
}
