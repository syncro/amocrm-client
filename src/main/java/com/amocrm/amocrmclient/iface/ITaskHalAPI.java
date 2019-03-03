package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;
import com.amocrm.amocrmclient.task.entity.Task;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ITaskHalAPI {

    @POST("/api/v2/tasks")
    Call<HalResponse<AddOrUpdResponse>> addOrUpdate(@Body AddOrUpdate<Task> addTask);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> list();

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> list(@Query("id") Long id);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> list(@Query("limit_rows") int limitRows);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> list(@Query("type") String type);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> list(@Query("type") String type, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> list(@Query("id") Long[] ids, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> listByResponsibleUserId(@Query("responsible_user_id[]") Long[] responsibleUserIds);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> listByResponsibleUserId(@Query("responsible_user_id[]") Long[] responsibleUserIds, @Query("limit_rows") int limitRows);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> listByResponsibleUserId(@Query("responsible_user_id[]") Long[] responsibleUserIds, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> listByElementId(@Query("element_id") String elementId);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> listByType(@Query("type") String type);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> listByType(@Query("type") String type, @Query("limit_rows") int limitRows);

    @GET("/api/v2/tasks")
    Call<HalResponse<Task>> listByType(@Query("type") String type, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

}
