package com.amocrm.amocrmclient.customer.entity.list;


import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class LCFilter {

    public Long id;

    public LCFilterDate date;

    @SerializedName("next_date")
    public LCFilterDate nextDate;

    @SerializedName("main_user")
    public List<String> mainUser;

    public List<LCFilterTask> tasks;

    public Map<String, String> cf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LCFilterDate getDate() {
        return date;
    }

    public void setDate(LCFilterDate date) {
        this.date = date;
    }

    public LCFilterDate getNextDate() {
        return nextDate;
    }

    public void setNextDate(LCFilterDate nextDate) {
        this.nextDate = nextDate;
    }

    public List<String> getMainUser() {
        return mainUser;
    }

    public void setMainUser(List<String> mainUser) {
        this.mainUser = mainUser;
    }

    public List<LCFilterTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<LCFilterTask> tasks) {
        this.tasks = tasks;
    }

    public Map<String, String> getCf() {
        return cf;
    }

    public void setCf(Map<String, String> cf) {
        this.cf = cf;
    }
}
