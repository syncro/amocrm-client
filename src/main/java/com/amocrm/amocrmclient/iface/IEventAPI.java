package com.amocrm.amocrmclient.iface;

import com.amocrm.amocrmclient.event.entity.LNResponseData;
import com.amocrm.amocrmclient.event.entity.SNParam;
import com.amocrm.amocrmclient.event.entity.SNResponseData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IEventAPI {

    @POST("/private/api/v2/json/notes/set")
    Call<SNResponseData> setNote(@Body SNParam setNote);

    @GET("/private/api/v2/json/notes/list")
    Call<LNResponseData> list();

    @GET("/private/api/v2/json/notes/list")
    Call<LNResponseData> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/notes/list")
    Call<LNResponseData> list(@Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/notes/list")
    Call<LNResponseData> listByType(@Query("type") String type);

    @GET("/private/api/v2/json/notes/list")
    Call<LNResponseData> listByType(@Query("type") String type, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/notes/list")
    Call<LNResponseData> listByType(@Query("type") String type, @Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/notes/list")
    Call<LNResponseData> list(@Query("id") Long id);

    @GET("/private/api/v2/json/notes/list")
    Call<LNResponseData> listByElementId(@Query("elementId") Long elementId);

}
