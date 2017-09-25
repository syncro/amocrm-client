package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.contact.entity.links.CLResponseData;
import com.amocrm.amocrmclient.contact.entity.list.LCResponseData;
import com.amocrm.amocrmclient.contact.entity.set.SCResponseData;
import com.amocrm.amocrmclient.contact.entity.set.SCParam;

import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IContactAPI {

    @POST("/private/api/v2/json/contacts/set")
    Call<SCResponseData> setContact(@Body SCParam setContact);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list();

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("query") String query);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> listSince(@Header("IF-MODIFIED-SINCE") String modified);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("query") String query, @Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("query") String query, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId, @Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    /**
     * list contacts by type
     * @param type contact (default), company or all
     * @return response data
     */
    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> listByType(@Query("type") String type);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> listByType(@Query("type") String type, @Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> listByType(@Query("type") String type, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("id") Long id);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("id[]") Long[] id);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> list(@Query("id[]") Collection<String> id);

    @GET("/private/api/v2/json/contacts/list")
    Call<LCResponseData> listByIdsSince(@Query("id") Collection<String> id, @Header("IF-MODIFIED-SINCE") String datetime);

    @GET("/private/api/v2/json/contacts/links")
    Call<CLResponseData> links();

    @GET("/private/api/v2/json/contacts/links")
    Call<CLResponseData> linksByContacts(@Query("contacts_link[]") Collection<String> contactIds);

    @GET("/private/api/v2/json/contacts/links")
    Call<CLResponseData> linksByLeads(@Query("deals_link[]") Collection<String> leadIds);

    @GET("/private/api/v2/json/contacts/links")
    Call<CLResponseData> linksByLeads(@Query("deals_link[]") Collection<String> leadIds, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);
}
