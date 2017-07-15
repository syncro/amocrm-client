package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.contact.links.CLResponseData;
import com.amocrm.amocrmclient.entity.contact.list.LCResponseData;
import com.amocrm.amocrmclient.entity.contact.set.SCResponseData;
import com.amocrm.amocrmclient.entity.contact.set.SCParam;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IContactAPI {

    @POST("/private/api/v2/json/contacts/set")
    Call<SCResponseData> setContact(@Body SCParam setContact);

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

    /**
     * list contacts by type
     * @param type contact (default), company or all
     * @return
     */
    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> listByType(@Query("type") String type);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("id") Long id);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("id") Long[] id);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("id") List<Long> id);

    @GET("/private/api/v2/json/contacts/links")
    Call<CLResponseData> links();
}
