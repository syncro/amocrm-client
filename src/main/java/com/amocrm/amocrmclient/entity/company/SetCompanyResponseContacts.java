package com.amocrm.amocrmclient.entity.company;

import com.google.gson.annotations.SerializedName;


public class SetCompanyResponseContacts {

    public SetCompanyResponseContactsActions contacts;

    @SerializedName("server_time")
    public int serverTime;
}
