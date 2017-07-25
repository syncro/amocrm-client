package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.transaction.entity.comment.CRequestParameter;
import com.amocrm.amocrmclient.transaction.entity.comment.CResponseData;
import com.amocrm.amocrmclient.transaction.entity.list.LTResponseData;
import com.amocrm.amocrmclient.transaction.entity.list.LTFilter;
import com.amocrm.amocrmclient.transaction.entity.set.STParameter;
import com.amocrm.amocrmclient.transaction.entity.set.STResponseData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ITransactionAPI {

    @POST("/private/api/v2/json/transactions/set")
    Call<STResponseData> setTransaction(@Body STParameter setTransaction);

    @GET("/private/api/v2/json/transactions/list")
    Call<LTResponseData> list();

    @GET("/private/api/v2/json/transactions/list")
    Call<LTResponseData> list(@Query("query") LTFilter filter, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @POST("/private/api/v2/json/transactions/comment")
    Call<CResponseData> commentTransaction(@Body CRequestParameter commentTransaction);
}
