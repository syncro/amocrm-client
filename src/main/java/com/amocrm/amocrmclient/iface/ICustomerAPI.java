package com.amocrm.amocrmclient.iface;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import com.amocrm.amocrmclient.entity.customer.ListCustomersFilter;
import com.amocrm.amocrmclient.entity.customer.ListCustomersResponse;
import com.amocrm.amocrmclient.entity.customer.SetCustomer;
import com.amocrm.amocrmclient.entity.customer.SetCustomerResponse;


public interface ICustomerAPI {

    @GET("/private/api/v2/json/customers/list")
    Call<ListCustomersResponse> list();

    @GET("/private/api/v2/json/customers/list")
    Call<ListCustomersResponse> list(@Query("filter") ListCustomersFilter filter);

    @GET("/private/api/v2/json/customers/list")
    Call<ListCustomersResponse> list(@Query("filter") ListCustomersFilter filter, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/customers/list")
    Call<ListCustomersResponse> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @POST("/private/api/v2/json/customers/set")
    Call<SetCustomerResponse> setCustomer(@Body SetCustomer setCustomer);


}
