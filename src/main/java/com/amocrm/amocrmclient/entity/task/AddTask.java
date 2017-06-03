package com.amocrm.amocrmclient.entity.task;


import com.google.gson.annotations.SerializedName;

public class AddTask {

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
