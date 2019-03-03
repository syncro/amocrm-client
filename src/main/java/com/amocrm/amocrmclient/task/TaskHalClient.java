package com.amocrm.amocrmclient.task;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.iface.ITaskHalAPI;
import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;
import com.amocrm.amocrmclient.task.entity.Task;

import retrofit2.Response;
import retrofit2.http.Body;

import java.io.IOException;


public interface TaskHalClient {

    ITaskHalAPI api();

    @AuthWithClient
    Response<HalResponse<AddOrUpdResponse>> addOrUpdate(@Body AddOrUpdate<Task> addTask) throws IOException;

    @AuthWithClient
    Response<HalResponse<Task>> list() throws IOException;

    @AuthWithClient
    Response<HalResponse<Task>> list(int limitRows) throws IOException;

    @AuthWithClient
    Response<HalResponse<Task>> list(int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Task>> list(String type) throws IOException;

    @AuthWithClient
    Response<HalResponse<Task>> list(String type, int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Task>> list(Long id, Long elementId, Long[] responsibleUserId, String type, int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Task>> listByResponsibleUserId(Long[] responsibleUserIds) throws IOException;

    @AuthWithClient
    Response<HalResponse<Task>> listByResponsibleUserId(Long[] responsibleUserIds, int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Task>> listByElementId(String elementId) throws IOException;

    @AuthWithClient
    Response<HalResponse<Task>> listByType(String elementId) throws IOException;
}
