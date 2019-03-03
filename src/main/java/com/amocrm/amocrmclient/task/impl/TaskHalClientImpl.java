package com.amocrm.amocrmclient.task.impl;


import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.iface.ITaskHalAPI;
import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;
import com.amocrm.amocrmclient.task.TaskHalClient;
import com.amocrm.amocrmclient.task.entity.Task;
import retrofit2.Response;

import java.io.IOException;

class TaskHalClientImpl implements TaskHalClient, WithAuthClient {

    private AuthClient authClient;

    private ITaskHalAPI taskAPI;

    public TaskHalClientImpl(AuthClient authClient, ITaskHalAPI taskAPI) {
        this.authClient = authClient;
        this.taskAPI = taskAPI;
    }

    public ITaskHalAPI api() {
        return taskAPI;
    }

    @Override
    public Response<HalResponse<AddOrUpdResponse>> addOrUpdate(AddOrUpdate<Task> addTask) throws IOException {
        return taskAPI.addOrUpdate(addTask).execute();
    }

    @Override
    public Response<HalResponse<Task>> list() throws IOException {
        return this.list(null, null, null, null, -1, -1);
    }

    @Override
    public Response<HalResponse<Task>> list(int limitRows) throws IOException {
        return this.list(null, null, null, null, limitRows, -1);
    }

    @Override
    public Response<HalResponse<Task>> list(int limitRows, int limitOffset) throws IOException {
        return this.list(null, null, null, null, limitRows, limitOffset);
    }

    @Override
    public Response<HalResponse<Task>> list(String type) throws IOException {
        return this.list(null, null, null, type, -1, -1);
    }

    @Override
    public Response<HalResponse<Task>> list(String type, int limitRows, int limitOffset) throws IOException {
        return this.list(null, null, null, type, limitRows, limitOffset);
    }

    @Override
    public Response<HalResponse<Task>> list(Long id, Long elementId, Long[] responsibleUserId, String type, int limitRows, int limitOffset) throws IOException {

        if (id != null) {

            return taskAPI.list(id).execute();

        } else if (responsibleUserId != null) {

            return taskAPI.listByResponsibleUserId(responsibleUserId).execute();


        } else if (responsibleUserId != null) {

            if (limitRows >= 0 && limitOffset >= 0) {

                return taskAPI.listByResponsibleUserId(responsibleUserId, limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return taskAPI.listByResponsibleUserId(responsibleUserId, limitRows).execute();

            }

            return taskAPI.listByResponsibleUserId(responsibleUserId).execute();

        } else if (type != null) {

            if (limitRows >= 0 && limitOffset >= 0) {

                return taskAPI.listByType(type, limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return taskAPI.listByType(type, limitRows).execute();

            }

            return taskAPI.listByType(type).execute();

        } else {

            if (limitRows >= 0 && limitOffset >= 0) {

                return taskAPI.list(limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return taskAPI.list(limitRows).execute();

            }

            return taskAPI.list().execute();
        }
    }

    @Override
    public Response<HalResponse<Task>> listByResponsibleUserId(Long[] responsibleUserIds) throws IOException {
        return null;
    }

    @Override
    public Response<HalResponse<Task>> listByResponsibleUserId(Long[] responsibleUserIds, int limitRows, int limitOffset) throws IOException {
        return null;
    }

    @Override
    public Response<HalResponse<Task>> listByElementId(String elementId) throws IOException {
        return null;
    }

    @Override
    public Response<HalResponse<Task>> listByType(String type) throws IOException {
        return taskAPI.listByType(type).execute();
    }

    @Override
    public AuthClient getAuthClient() {
        return authClient;

    }
}
