package com.amocrm.amocrmclient.entity.contact;


import com.google.gson.annotations.SerializedName;

public class ContactLinksResponseLink {

    @SerializedName("contact_id")
    public String contactId;

    @SerializedName("lead_id")
    public String leadId;

    @SerializedName("last_modified")
    public String lastModified;
}
