package com.amocrm.amocrmclient.entity.task;


import com.google.gson.annotations.SerializedName;

public class UpdateTask {

    public Long id;

    @SerializedName("element_id")
    public Long elementId;

    @SerializedName("element_type")
    public int elementType;

    @SerializedName("last_modified")
    public int lastModified;

    @SerializedName("task_type")
    public int taskType;

    public String text;

    @SerializedName("complete_till")
    public int completeTill;
}
