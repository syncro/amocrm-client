package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.customfields.entity.set.SFParam;
import com.amocrm.amocrmclient.customfields.entity.set.SFResponseData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ICustomFieldsAPI {

    @POST("/private/api/v2/json/fields/set")
    Call<SFResponseData> setFields(@Body SFParam setFields);


}
