package com.amocrm.amocrmclient.transaction.entity.comment;


import com.google.gson.annotations.SerializedName;

public class CResponseTransaction {

    public Long id;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("date_modify")
    public int dateModify;

    @SerializedName("created_by")
    public int createdBy;

    @SerializedName("modified_by")
    public int modifiedBy;

    @SerializedName("account_id")
    public Long accountId;

    @SerializedName("customer_id")
    public Long customerId;

    public boolean deleted;

    public int price;

    public String comment;

    public int date;
}
