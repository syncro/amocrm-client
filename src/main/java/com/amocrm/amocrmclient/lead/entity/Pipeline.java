package com.amocrm.amocrmclient.lead.entity;

import com.amocrm.amocrmclient.response.Links;
import com.google.gson.annotations.SerializedName;

/**
 * HAL API Entity
 */
public class Pipeline {

    public Long id;

    @SerializedName("_links")
    public Links links;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
