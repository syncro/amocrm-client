package com.amocrm.amocrmclient.entity.customer;


import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.entity.CustomField;

import java.util.List;


public class SetCustomerAdd {

    @SerializedName("main_user_id")
    public Long mainUserId;

    public String name;

    @SerializedName("next_price")
    public int nextPrice;

    @SerializedName("next_date")
    public int nextDate;

    public int periodicity;

    @SerializedName("custom_fields")
    public List<CustomField> customFields;

}
