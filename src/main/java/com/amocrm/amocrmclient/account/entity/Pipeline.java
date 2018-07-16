package com.amocrm.amocrmclient.account.entity;


import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * /private/api/v2/json/pipelines/list -- $.pipelines
 * /private/api/v2/json/pipelines/set -- $.response.pipelines.add.pipelines
 */
public class Pipeline {

    public Long id;

    public Long value;

    public String label;

    public String name;

    public Long sort;

    @SerializedName("is_main")
    public boolean isMain;
    /**
     * /private/api/v2/json/pipelines/list -- $.pipelines.statuses
     */
    public Map<Long, LeadStatus> statuses;

    public Long leads;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public boolean isMain() {
        return isMain;
    }

    public void setMain(boolean main) {
        isMain = main;
    }

    public Map<Long, LeadStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(Map<Long, LeadStatus> statuses) {
        this.statuses = statuses;
    }

    public Long getLeads() {
        return leads;
    }

    public void setLeads(Long leads) {
        this.leads = leads;
    }
}
