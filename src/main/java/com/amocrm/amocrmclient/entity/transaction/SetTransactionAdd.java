package com.amocrm.amocrmclient.entity.transaction;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class SetTransactionAdd {

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

    public boolean deleted;

    public BigDecimal price;

    @SerializedName("request_id")
    public Long requestId;

}
