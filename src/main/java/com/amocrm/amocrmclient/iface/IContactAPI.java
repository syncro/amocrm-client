package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.contact.ContactLinksResponse;
import com.amocrm.amocrmclient.entity.contact.ListContactsResponse;
import com.amocrm.amocrmclient.entity.contact.SetContactResponse;
import com.amocrm.amocrmclient.entity.contact.SetContact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IContactAPI {

    @POST("/private/api/v2/json/contacts/set")
    Call<SetContactResponse> setContact(@Body SetContact setContact);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListContactsResponse> list();

    @GET("/private/api/v2/json/contacts/list")
    Call<ListContactsResponse> list(@Query("query") String query);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListContactsResponse> list(@Query("query") String query, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListContactsResponse> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListContactsResponse> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId);

    /**
     * list contacts by type
     * @param type contact (default), company or all
     * @return
     */
    @GET("/private/api/v2/json/contacts/list")
    Call<ListContactsResponse> listByType(@Query("type") String type);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListContactsResponse> list(@Query("id") Long id);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListContactsResponse> list(@Query("id") Long[] id);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListContactsResponse> list(@Query("id") List<Long> id);

    @GET("/private/api/v2/json/contacts/links")
    Call<ContactLinksResponse> links();
}
