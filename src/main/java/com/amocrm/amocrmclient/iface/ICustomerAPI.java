package com.amocrm.amocrmclient.iface;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import com.amocrm.amocrmclient.entity.customer.list.LCFilter;
import com.amocrm.amocrmclient.entity.customer.list.LCResponseData;
import com.amocrm.amocrmclient.entity.customer.set.SCParam;
import com.amocrm.amocrmclient.entity.customer.set.SCResponseData;


public interface ICustomerAPI {

    @GET("/private/api/v2/json/customers/list")
    Call<LCResponseData> list();

    @GET("/private/api/v2/json/customers/list")
    Call<LCResponseData> list(@Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/customers/list")
    Call<LCResponseData> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/customers/list")
    Call<LCResponseData> list(@Query("filter") LCFilter filter);

    @GET("/private/api/v2/json/customers/list")
    Call<LCResponseData> list(@Query("filter") LCFilter filter, @Query("limit_rows") int limitRows);

    @GET("/private/api/v2/json/customers/list")
    Call<LCResponseData> list(@Query("filter") LCFilter filter, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @POST("/private/api/v2/json/customers/set")
    Call<SCResponseData> setCustomer(@Body SCParam setCustomer);

}
