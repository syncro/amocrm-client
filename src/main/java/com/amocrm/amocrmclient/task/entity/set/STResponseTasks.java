package com.amocrm.amocrmclient.task.entity.set;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * /private/api/v2/json/tasks/set -- $.tasks
 */
public class STResponseTasks {
    /**
     * /private/api/v2/json/tasks/set -- $.tasks.add
     */
    public List<STResponseAdd> add;
    /**
     * /private/api/v2/json/tasks/set -- $.tasks.update
     */
    public List<STResponseUpdateTask> update;

    @SerializedName("server_time")
    public int serverTime;

    public List<STResponseAdd> getAdd() {
        return add;
    }

    public void setAdd(List<STResponseAdd> add) {
        this.add = add;
    }

    public List<STResponseUpdateTask> getUpdate() {
        return update;
    }

    public void setUpdate(List<STResponseUpdateTask> update) {
        this.update = update;
    }

    public int getServerTime() {
        return serverTime;
    }

    public void setServerTime(int serverTime) {
        this.serverTime = serverTime;
    }
}
