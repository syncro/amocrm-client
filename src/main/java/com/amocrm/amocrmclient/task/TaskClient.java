package com.amocrm.amocrmclient.task;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.iface.ITaskAPI;
import com.amocrm.amocrmclient.task.entity.set.STParam;
import com.amocrm.amocrmclient.task.entity.set.STResponse;

import java.io.IOException;

import retrofit2.Response;


public interface TaskClient {

    ITaskAPI api();

    STParam createTask(String text, long elementId, int elementType, int taskType, int completeTill);

    @AuthWithClient
    Response<STResponse> setTask(STParam setTask) throws IOException;
}
