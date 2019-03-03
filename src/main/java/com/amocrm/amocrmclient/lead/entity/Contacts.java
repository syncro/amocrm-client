package com.amocrm.amocrmclient.lead.entity;

import com.amocrm.amocrmclient.response.Links;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;

/**
 * HAL API Contacts Entity
 */
public class Contacts {

    public Collection<Long> id;

    @SerializedName("_links")
    public Links links;

    public Collection<Long> getId() {
        return id;
    }

    public void setId(Collection<Long> id) {
        this.id = id;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
