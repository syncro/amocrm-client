package com.amocrm.amocrmclient.lead.entity;

import com.amocrm.amocrmclient.response.Links;

public class AcceptIncLeadEntry {

    public Long[] companies;

    public Long[] leads;

    public Long[] contacts;

    public Links links;

    public Long[] getCompanies() {
        return companies;
    }

    public void setCompanies(Long[] companies) {
        this.companies = companies;
    }

    public Long[] getLeads() {
        return leads;
    }

    public void setLeads(Long[] leads) {
        this.leads = leads;
    }

    public Long[] getContacts() {
        return contacts;
    }

    public void setContacts(Long[] contacts) {
        this.contacts = contacts;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
