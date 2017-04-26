package com.amocrm.amocrmclient.iface;


import com.amocrm.amocrmclient.entity.transaction.SetTransaction;
import com.amocrm.amocrmclient.entity.transaction.SetTransactionResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ITransactionAPI {

    @POST("/private/api/v2/json/transactions/set")
    Call<SetTransactionResponse> setTransaction(@Body SetTransaction setTransaction);

}
