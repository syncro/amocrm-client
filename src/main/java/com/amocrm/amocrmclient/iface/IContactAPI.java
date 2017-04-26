package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.contact.AddContactResponse;
import com.amocrm.amocrmclient.entity.contact.SetContact;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IContactAPI {

    @POST("/private/api/v2/json/contacts/set")
    Call<AddContactResponse> setContact(@Body SetContact setContact);

}
