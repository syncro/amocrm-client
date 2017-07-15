package com.amocrm.amocrmclient.entity.task;


public enum TaskType {
    CONTACT("contact"),
    LEAD("lead"),
    COMPANY("company");

    String name;

    TaskType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
