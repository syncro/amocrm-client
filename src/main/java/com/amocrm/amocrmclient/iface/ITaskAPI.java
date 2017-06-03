package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.task.SetTask;
import com.amocrm.amocrmclient.entity.task.SetTaskResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ITaskAPI {

    @POST("/private/api/v2/json/tasks/set")
    Call<SetTaskResponse> setTask(@Body SetTask setTask);

}
