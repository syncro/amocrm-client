package com.amocrm.amocrmclient.entity.account;


import com.google.gson.annotations.SerializedName;

public class AccountsDataLimits {

    @SerializedName("users_count")
    public boolean usersCount;

    @SerializedName("contacts_count")
    public boolean contactsCount;

    @SerializedName("active_deals_count")
    public boolean activeDealsCount;

}
