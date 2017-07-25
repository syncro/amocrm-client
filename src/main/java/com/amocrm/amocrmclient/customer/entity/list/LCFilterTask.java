package com.amocrm.amocrmclient.customer.entity.list;


public enum LCFilterTask {
    TODAY("today"),
    TOMORROW("tomorrow"),
    WEEK("week"),
    MONTH("month"),
    QUARTER("quarter"),
    NO_TASKS("no_tasks"),
    FAILED_TASKS("failed_tasks");

    String name;

    LCFilterTask(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
