package com.amocrm.amocrmclient.entity.account;


import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Pipeline {

    public Long id;

    public Long value;

    public String label;

    public String name;

    public Long sort;

    @SerializedName("is_main")
    public boolean isMain;

    public Map<Long, PipelineStatus> statuses;

    public Long leads;
}
