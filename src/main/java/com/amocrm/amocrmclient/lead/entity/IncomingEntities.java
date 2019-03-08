package com.amocrm.amocrmclient.lead.entity;

import com.amocrm.amocrmclient.contact.entity.Contact;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;

public class IncomingEntities {

    public Collection<Lead> leads;

    public Collection<Contact> contacts;

    public Collection<Company> companies;

    @SerializedName("incoming_lead_info")
    public IncomingLeadInfo incomingLeadInfo;

    public Collection<Lead> getLeads() {
        return leads;
    }

    public void setLeads(Collection<Lead> leads) {
        this.leads = leads;
    }

    public Collection<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Collection<Contact> contacts) {
        this.contacts = contacts;
    }

    public Collection<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(Collection<Company> companies) {
        this.companies = companies;
    }

    public IncomingLeadInfo getIncomingLeadInfo() {
        return incomingLeadInfo;
    }

    public void setIncomingLeadInfo(IncomingLeadInfo incomingLeadInfo) {
        this.incomingLeadInfo = incomingLeadInfo;
    }
}
