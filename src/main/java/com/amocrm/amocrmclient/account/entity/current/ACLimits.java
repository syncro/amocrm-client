package com.amocrm.amocrmclient.account.entity.current;


import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

@JsonAdapter(ACLimitsDeserializer.class)
public class ACLimits {

    @SerializedName("users_count")
    public Integer usersCount;

    @SerializedName("contacts_count")
    public Integer contactsCount;

    @SerializedName("active_deals_count")
    public Integer activeDealsCount;


}
