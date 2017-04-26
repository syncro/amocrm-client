package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.customer.SetCustomer;
import com.amocrm.amocrmclient.entity.customer.SetCustomerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ICustomerAPI {

    @POST("/private/api/v2/json/customers/set")
    Call<SetCustomerResponse> setCustomer(@Body SetCustomer setCustomer);

}
