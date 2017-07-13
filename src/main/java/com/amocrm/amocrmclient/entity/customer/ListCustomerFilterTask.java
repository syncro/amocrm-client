package com.amocrm.amocrmclient.entity.customer;


public enum ListCustomerFilterTask {
    TODAY("today"),
    TOMORROW("tomorrow"),
    WEEK("week"),
    MONTH("month"),
    QUARTER("quarter"),
    NO_TASKS("no_tasks"),
    FAILED_TASKS("failed_tasks");

    String name;

    ListCustomerFilterTask(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
