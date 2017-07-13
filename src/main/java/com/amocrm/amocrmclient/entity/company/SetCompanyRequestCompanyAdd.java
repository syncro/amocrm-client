package com.amocrm.amocrmclient.entity.company;

import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.entity.CustomField;

import java.util.List;

public class SetCompanyRequestCompanyAdd {

    public String name;

    @SerializedName("request_id")
    public Long requestId;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("last_modified")
    public int lastModified;


    @SerializedName("responsible_user_id")
    public String responsibleUserId;

    @SerializedName("linked_leads_id")
    public List<Long> linkedLeadsId;

    public String tags;

    @SerializedName("custom_fields")
    public List<CustomField> customFields;
}
