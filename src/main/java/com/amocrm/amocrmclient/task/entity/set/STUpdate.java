package com.amocrm.amocrmclient.task.entity.set;


import com.google.gson.annotations.SerializedName;

public class STUpdate {

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
