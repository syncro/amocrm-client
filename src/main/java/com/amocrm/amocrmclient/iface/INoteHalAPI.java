package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.note.entity.Note;
import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface INoteHalAPI {

    @POST("/api/v2/notes")
    Call<HalResponse<AddOrUpdResponse>> addOrUpdate(@Body AddOrUpdate<Note> addNote);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> list();

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> list(@Query("id") Long id);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> list(@Query("limit_rows") int limitRows);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> list(@Query("type") String type);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> list(@Query("type") String type, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> list(@Query("id") Long[] ids, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> listByResponsibleUserId(@Query("responsible_user_id[]") Long[] responsibleUserIds);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> listByResponsibleUserId(@Query("responsible_user_id[]") Long[] responsibleUserIds, @Query("limit_rows") int limitRows);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> listByResponsibleUserId(@Query("responsible_user_id[]") Long[] responsibleUserIds, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> listByElementId(@Query("element_id") String elementId);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> listByType(@Query("type") String type);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> listByType(@Query("type") String type, @Query("limit_rows") int limitRows);

    @GET("/api/v2/notes")
    Call<HalResponse<Note>> listByType(@Query("type") String type, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

}
