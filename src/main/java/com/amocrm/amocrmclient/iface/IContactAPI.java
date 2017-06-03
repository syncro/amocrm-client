package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.contact.ContactLinksResponse;
import com.amocrm.amocrmclient.entity.contact.ListContactsResponse;
import com.amocrm.amocrmclient.entity.contact.SetContactResponse;
import com.amocrm.amocrmclient.entity.contact.SetContact;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IContactAPI {

    @POST("/private/api/v2/json/contacts/set")
    Call<SetContactResponse> setContact(@Body SetContact setContact);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListContactsResponse> list();

    @GET("/private/api/v2/json/contacts/links")
    Call<ContactLinksResponse> links();
}
