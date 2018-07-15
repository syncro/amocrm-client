package com.amocrm.amocrmclient.task.impl;


import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.iface.ITaskAPI;
import com.amocrm.amocrmclient.task.TaskClient;
import com.amocrm.amocrmclient.task.entity.set.STAdd;
import com.amocrm.amocrmclient.task.entity.set.STParam;
import com.amocrm.amocrmclient.task.entity.set.STRequest;
import com.amocrm.amocrmclient.task.entity.set.STRequestTasks;
import com.amocrm.amocrmclient.task.entity.set.STResponse;

import java.io.IOException;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import retrofit2.Response;

@AllArgsConstructor
class TaskClientImpl implements TaskClient, WithAuthClient {

    private AuthClient authClient;

    private ITaskAPI taskAPI;

    public ITaskAPI api() {
        return taskAPI;
    }

    public STParam createTask(String text, long elementId, int elementType, int taskType, int completeTill) {

        STParam setTask = new STParam();
        setTask.request = new STRequest();
        setTask.request.tasks = new STRequestTasks();
        setTask.request.tasks.add = new ArrayList<>();
        STAdd addTask = new STAdd();
        addTask.text = text;
        addTask.elementId = elementId;
        addTask.elementType = elementType;
        addTask.taskType = taskType;
        addTask.completeTill = completeTill;

        setTask.request.tasks.add.add(addTask);

        return setTask;
    }

    public Response<STResponse> setTask(STParam setTask) throws IOException {

        return taskAPI.setTask(setTask).execute();

    }

    @Override
    public AuthClient getAuthClient() {

        return authClient;

    }
}
