package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.company.ListCompaniesResponse;
import com.amocrm.amocrmclient.entity.company.SetCompany;
import com.amocrm.amocrmclient.entity.company.SetCompanyResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ICompanyAPI {

    @POST("/private/api/v2/json/contacts/set")
    Call<SetCompanyResponse> setCompany(@Body SetCompany setCompany);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListCompaniesResponse> list();

    @GET("/private/api/v2/json/contacts/list")
    Call<ListCompaniesResponse> list(@Query("query") String query);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListCompaniesResponse> list(@Query("query") String query, @Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListCompaniesResponse> list(@Query("limit_rows") int limitRows, @Query("limit_offset") int limitOffset);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListCompaniesResponse> listByResponsibleUserId(@Query("responsible_user_id") String responsibleUserId);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListCompaniesResponse> list(@Query("id") Long id);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListCompaniesResponse> list(@Query("id") Long[] id);

    @GET("/private/api/v2/json/contacts/list")
    Call<ListCompaniesResponse> list(@Query("id") List<Long> id);

}
