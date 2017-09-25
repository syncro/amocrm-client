package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.company.entity.list.LCResponseData;
import com.amocrm.amocrmclient.company.entity.set.SCParam;
import com.amocrm.amocrmclient.company.entity.set.SCResponseData;

import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ICompanyAPI {

    @POST("/private/api/v2/json/contacts/set")
    Call<SCResponseData> setCompany(@Body SCParam setCompany);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list();

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("query") String query);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("query") String query, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("id") Long id);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("id[]") Long[] id);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("id") Collection<Long> id);

}
