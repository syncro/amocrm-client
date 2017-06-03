package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.customer.ListCustomersResponse;
import com.amocrm.amocrmclient.entity.customer.SetCustomer;
import com.amocrm.amocrmclient.entity.customer.SetCustomerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ICustomerAPI {

    @GET("/private/api/v2/json/customers/list")
    Call<ListCustomersResponse> list();

    @POST("/private/api/v2/json/customers/set")
    Call<SetCustomerResponse> setCustomer(@Body SetCustomer setCustomer);


}
