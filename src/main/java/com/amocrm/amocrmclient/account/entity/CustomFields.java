package com.amocrm.amocrmclient.account.entity;


import java.util.List;

public class CustomFields {

    public List<CustomFieldSettings> contacts;

    public List<CustomFieldSettings> leads;

    public List<CustomFieldSettings> companies;

    public List<CustomFieldSettings> customers;

    public List<CustomFieldSettings> getContacts() {
        return contacts;
    }

    public void setContacts(List<CustomFieldSettings> contacts) {
        this.contacts = contacts;
    }

    public List<CustomFieldSettings> getLeads() {
        return leads;
    }

    public void setLeads(List<CustomFieldSettings> leads) {
        this.leads = leads;
    }

    public List<CustomFieldSettings> getCompanies() {
        return companies;
    }

    public void setCompanies(List<CustomFieldSettings> companies) {
        this.companies = companies;
    }

    public List<CustomFieldSettings> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomFieldSettings> customers) {
        this.customers = customers;
    }
}
