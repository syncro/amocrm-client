package com.amocrm.amocrmclient.entity.contact;


import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.entity.CustomField;

import java.util.List;

public class ResponseContactsContact {

    public String id;

    public String name;

    @SerializedName("last_modified")
    public int lastModified;

    @SerializedName("account_id")
    public String accountId;

    @SerializedName("responsible_user_id")
    public String responsibleUserId;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("created_user_id")
    public String createdUserId;

    @SerializedName("linked_leads_id")
    public List<String> linkedLeadsId;

    public List<ContactTag> tags;

    public String type;

    @SerializedName("custom_fields")
    public List<CustomField> customFields;

    @SerializedName("server_time")
    public int serverTime;

}
