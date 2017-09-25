package com.amocrm.amocrmclient.account.entity.current;


import com.google.gson.annotations.SerializedName;

public class ACLimits {

    @SerializedName("users_count")
    public int usersCount;

    @SerializedName("contacts_count")
    public int contactsCount;

    @SerializedName("active_deals_count")
    public int activeDealsCount;

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    public int getContactsCount() {
        return contactsCount;
    }

    public void setContactsCount(int contactsCount) {
        this.contactsCount = contactsCount;
    }

    public int getActiveDealsCount() {
        return activeDealsCount;
    }

    public void setActiveDealsCount(int activeDealsCount) {
        this.activeDealsCount = activeDealsCount;
    }
}
