package com.amocrm.amocrmclient.event.entity;

import com.google.gson.annotations.SerializedName;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Note extends SNAdd {

    @SerializedName("element_id")
    public Long id;

    @SerializedName("create_user_id")
    public String createUserId;

    @SerializedName("account_id")
    public String accountId;

    public String editable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEditable() {
        return editable;
    }

    public void setEditable(String editable) {
        this.editable = editable;
    }
}
