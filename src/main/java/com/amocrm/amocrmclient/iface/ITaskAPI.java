package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.task.entity.list.LTResponseData;
import com.amocrm.amocrmclient.task.entity.set.STParam;
import com.amocrm.amocrmclient.task.entity.set.STResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ITaskAPI {

    @POST("/private/api/v2/json/tasks/set")
    Call<STResponse> setTask(@Body STParam setTask);

    @GET("/private/api/v2/json/tasks/list")
    Call<LTResponseData> list();

    @GET("/private/api/v2/json/tasks/list")
    Call<LTResponseData> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/tasks/list")
    Call<LTResponseData> list(@Query("type") String type);

    @GET("/private/api/v2/json/tasks/list")
    Call<LTResponseData> list(@Query("type") String type, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/tasks/list")
    Call<LTResponseData> list(@Query("id") Long[] ids, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/tasks/list")
    Call<LTResponseData> listByResponsibleId(@Query("responsible_user_id") Long[] responsibleUserIds);

    @GET("/private/api/v2/json/tasks/list")
    Call<LTResponseData> listByResponsibleId(@Query("responsible_user_id") Long[] responsibleUserIds, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/tasks/list")
    Call<LTResponseData> listByElementId(@Query("element_id") String elementId);

}
