package com.amocrm.amocrmclient.entity.task;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SetTaskResponseTasks {

    public List<SetTaskResponseAddTask> add;

    public List<SetTaskResponseUpdateTask> update;

    @SerializedName("server_time")
    public int serverTime;
}
