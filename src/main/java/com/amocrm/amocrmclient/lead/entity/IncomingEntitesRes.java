package com.amocrm.amocrmclient.lead.entity;


import java.util.Collection;

public class IncomingEntitesRes {

    public Collection<Lead> leads;

    public Collection<IncomingContact> contacts;

    public Collection<Company> companies;

    public Collection<Lead> getLeads() {
        return leads;
    }

    public void setLeads(Collection<Lead> leads) {
        this.leads = leads;
    }

    public Collection<IncomingContact> getContacts() {
        return contacts;
    }

    public void setContacts(Collection<IncomingContact> contacts) {
        this.contacts = contacts;
    }

    public Collection<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(Collection<Company> companies) {
        this.companies = companies;
    }
}
