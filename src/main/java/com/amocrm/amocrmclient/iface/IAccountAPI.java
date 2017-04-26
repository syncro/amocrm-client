package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.account.AccountsDataResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IAccountAPI {

    @GET("/private/api/v2/json/accounts/current")
    Call<AccountsDataResponse> current();

}
