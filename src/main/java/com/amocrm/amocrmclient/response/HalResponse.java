package com.amocrm.amocrmclient.response;

import com.google.gson.annotations.SerializedName;

public class HalResponse<RespEntity> {

    @SerializedName("_links")
    public Links links;

    @SerializedName("_embedded")
    public Embedded<RespEntity> embedded;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Embedded<RespEntity> getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded<RespEntity> embedded) {
        this.embedded = embedded;
    }
}
