package com.amocrm.amocrmclient.task.entity.set;


import com.google.gson.annotations.SerializedName;

public class STAdd {

    @SerializedName("element_id")
    public Long elementId;

    @SerializedName("element_type")
    public int elementType;

    @SerializedName("task_type")
    public int taskType;

    public String text;

    @SerializedName("complete_till")
    public int completeTill;
}
