package com.amocrm.amocrmclient.lead.entity.list;



import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LLResponse {

    public List<LLResponseLead> leads;

    @SerializedName("server_time")
    public int serverTime;
}
