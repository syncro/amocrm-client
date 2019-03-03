package com.amocrm.amocrmclient.lead.entity;

import com.amocrm.amocrmclient.response.Links;
import com.google.gson.annotations.SerializedName;

public class Company {

    public Long id;

    public String name;

    @SerializedName("_links")
    public Links links;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
