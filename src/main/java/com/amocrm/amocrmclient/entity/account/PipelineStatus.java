package com.amocrm.amocrmclient.entity.account;

import com.google.gson.annotations.SerializedName;

public class PipelineStatus {

    public Long id;

    public String name;

    public String color;

    public Long sort;

    public String editable;

    @SerializedName("pipeline_id")
    public Long pipelineId;


}
