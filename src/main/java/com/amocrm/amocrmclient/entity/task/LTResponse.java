package com.amocrm.amocrmclient.entity.task;

import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.entity.transaction.list.LTPagination;
import com.amocrm.amocrmclient.entity.transaction.list.LTTransaction;

import java.util.Map;

public class LTResponse {

    public Map<String, LTTransaction> transactions;

    public LTPagination pagination;

    @SerializedName("server_time")
    public int serverTime;

}
