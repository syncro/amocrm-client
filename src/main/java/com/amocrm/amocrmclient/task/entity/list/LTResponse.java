package com.amocrm.amocrmclient.task.entity.list;

import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.transaction.entity.list.LTPagination;
import com.amocrm.amocrmclient.transaction.entity.list.LTTransaction;

import java.util.Map;

public class LTResponse {

    public Map<String, LTTransaction> transactions;

    public LTPagination pagination;

    @SerializedName("server_time")
    public int serverTime;

}
