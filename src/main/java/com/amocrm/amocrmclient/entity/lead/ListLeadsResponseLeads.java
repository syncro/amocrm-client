package com.amocrm.amocrmclient.entity.lead;



import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListLeadsResponseLeads {

    public List<ResponseLeadsLead> leads;

    @SerializedName("server_time")
    public int serverTime;
}
