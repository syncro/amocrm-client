package com.amocrm.amocrmclient.task.entity.set;


/**
 * /private/api/v2/json/tasks/set -- $.
 */
public class STResponse {
    /**
     * /private/api/v2/json/tasks/set -- $.tasks
     */
    public STResponseTasks tasks;

    public STResponseTasks getTasks() {
        return tasks;
    }

    public void setTasks(STResponseTasks tasks) {
        this.tasks = tasks;
    }
}
