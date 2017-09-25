package com.amocrm.amocrmclient.contact.entity.links;


import com.google.gson.annotations.SerializedName;

public class CLResponseLink {

    @SerializedName("contact_id")
    public String contactId;

    @SerializedName("lead_id")
    public String leadId;

    @SerializedName("last_modified")
    public String lastModified;

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
}
