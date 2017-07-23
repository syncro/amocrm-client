package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.account.entity.current.ACData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IAccountAPI {

    @GET("/private/api/v2/json/accounts/current")
    Call<ACData> current(@Query("free_users") String freeUsers);

    @GET("/private/api/v2/json/accounts/current")
    Call<ACData> current();
}
