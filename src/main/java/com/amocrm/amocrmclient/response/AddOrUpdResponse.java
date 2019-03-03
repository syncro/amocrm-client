package com.amocrm.amocrmclient.response;

import com.google.gson.annotations.SerializedName;

public class AddOrUpdResponse {

    @SerializedName("_links")
    public Links links;

    @SerializedName("_embedded")
    public Embedded<ResponseItem> embedded;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Embedded<ResponseItem> getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded<ResponseItem> embedded) {
        this.embedded = embedded;
    }
}
