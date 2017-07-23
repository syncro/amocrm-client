package com.amocrm.amocrmclient.contact.entity.links;


import com.google.gson.annotations.SerializedName;

public class CLResponseLink {

    @SerializedName("contact_id")
    public String contactId;

    @SerializedName("lead_id")
    public String leadId;

    @SerializedName("last_modified")
    public String lastModified;
}
