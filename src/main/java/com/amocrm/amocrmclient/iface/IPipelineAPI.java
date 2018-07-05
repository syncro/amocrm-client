package com.amocrm.amocrmclient.iface;

import com.amocrm.amocrmclient.pipeline.entity.DPResponseData;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import com.amocrm.amocrmclient.pipeline.entity.SPParam;
import com.amocrm.amocrmclient.pipeline.entity.SPResponseData;
import com.amocrm.amocrmclient.pipeline.entity.LPResponseData;

public interface IPipelineAPI {

    @GET("/private/api/v2/json/pipelines/list")
    Call<LPResponseData> list();

    @GET("/private/api/v2/json/pipelines/list")
    Call<LPResponseData> list(@Query("id") Long id);

    @POST("/private/api/v2/json/pipelines/set")
    Call<SPResponseData> setPipeline(@Body SPParam setPipeline);

    @DELETE("/private/api/v2/json/pipelines/list")
    Call<DPResponseData> delete(@Query("id") Long id);
}
