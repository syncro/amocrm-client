package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.contact.entity.Contact;
import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.io.IOException;
import java.util.Collection;

public interface IContactHalAPI {

    @POST("/api/v2/contacts")
    Call<HalResponse<AddOrUpdResponse>> add(@Body AddOrUpdate<Contact> addContact) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> list() throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> list(@Query("limit_rows") int limitRows) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> list(@Query("query") String query) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> listSince(@Header("IF-MODIFIED-SINCE") String modified) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> list(@Query("query") String query, @Query("limit_rows") int limitRows) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> list(@Query("query") String query, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId, @Query("limit_rows") int limitRows) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset) throws IOException;

    /**
     * list contacts by type
     * @param type contact (default), company or all
     * @return response data
     */
    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> listByType(@Query("type") String type) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> listByType(@Query("type") String type, @Query("limit_rows") int limitRows) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> listByType(@Query("type") String type, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> list(@Query("id") Long id) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> list(@Query("id[]") Long[] id) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> list(@Query("id[]") Collection<String> id) throws IOException;

    @GET("/api/v2/contacts")
    Call<HalResponse<Contact>> listByIdsSince(@Query("id") Collection<String> id, @Header("IF-MODIFIED-SINCE") String datetime) throws IOException;


}
