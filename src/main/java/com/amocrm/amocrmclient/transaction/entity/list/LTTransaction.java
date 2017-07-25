package com.amocrm.amocrmclient.transaction.entity.list;


import com.google.gson.annotations.SerializedName;


public class LTTransaction {

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

    @SerializedName("customer_id")
    public Long customerId;

    public String comment;

    public boolean deleted;

    public int price;

    public int date;
}
