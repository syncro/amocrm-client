package com.amocrm.amocrmclient.account.entity;


import com.google.gson.annotations.SerializedName;

public class CustomFieldSettings {

    public Long id;

    public String name;

    public String code;

    public String multiple;

    @SerializedName("type_id")
    public Long typeId;

    public Long disabled;

    public Long sort;

}
