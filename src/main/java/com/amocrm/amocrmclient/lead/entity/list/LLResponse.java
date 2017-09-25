package com.amocrm.amocrmclient.lead.entity.list;



import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LLResponse {

    public List<LLResponseLead> leads;

    @SerializedName("server_time")
    public int serverTime;

    public List<LLResponseLead> getLeads() {
        return leads;
    }

    public void setLeads(List<LLResponseLead> leads) {
        this.leads = leads;
    }

    public int getServerTime() {
        return serverTime;
    }

    public void setServerTime(int serverTime) {
        this.serverTime = serverTime;
    }
}
