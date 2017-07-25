package com.amocrm.amocrmclient.task.entity.set;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class STResponseTasks {

    public List<STResponseAdd> add;

    public List<STResponseUpdateTask> update;

    @SerializedName("server_time")
    public int serverTime;
}
