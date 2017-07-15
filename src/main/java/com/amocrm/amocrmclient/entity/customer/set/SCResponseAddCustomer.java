package com.amocrm.amocrmclient.entity.customer.set;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SCResponseAddCustomer {

    public Long id;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("date_modify")
    public int dateModify;

    @SerializedName("created_by")
    public Long createdBy;

    @SerializedName("modified_by")
    public Long modifiedBy;

    @SerializedName("account_id")
    public Long accountId;

    @SerializedName("main_user_id")
    public Long mainUserId;

    public String name;

    public boolean deleted;

    @SerializedName("next_price")
    public int nextPrice;

    public int periodicity;

    @SerializedName("next_date")
    public int nextDate;

    @SerializedName("task_last_date")
    public int taskLastDate;

    @SerializedName("custom_fields")
    public List<SCResponseCustomField> customFields;

    public List<String> tags;

    @SerializedName("request_id")
    public Long requestId;


}
