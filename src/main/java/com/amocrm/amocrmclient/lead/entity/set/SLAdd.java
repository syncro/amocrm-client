package com.amocrm.amocrmclient.lead.entity.set;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;



public class SLAdd {

    public String name;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("last_modified")
    public int lastModified;

    @SerializedName("status_id")
    public Long statusId;

    @SerializedName("price")
    public BigDecimal price;

    @SerializedName("responsible_user_id")
    public Long responsibleUserId;

    public String tags;

}
