package com.amocrm.amocrmclient.lead.entity.list;


import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.entity.CustomField;
import com.amocrm.amocrmclient.entity.Tag;

import java.util.List;

public class LLResponseLead {

    public String id;

    public String name;

    @SerializedName("last_modified")
    public int lastModified;

    @SerializedName("status_id")
    public String statusId;

    public String price;

    @SerializedName("responsible_user_id")
    public String responsibleUserId;

    // Long or false
    @SerializedName("main_contact_id")
    public Object mainContactId;

    public List<Tag> tags;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("account_id")
    public String accountId;

    @SerializedName("create_user_id")
    public String createUserId;

    @SerializedName("custom_fields")
    public List<CustomField> customFields;

    @SerializedName("data_close")
    public int dateClose;
}
