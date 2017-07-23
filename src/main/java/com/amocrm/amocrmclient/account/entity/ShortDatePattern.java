package com.amocrm.amocrmclient.account.entity;


import com.google.gson.annotations.SerializedName;

public class ShortDatePattern {

    public String date;

    public String time;

    @SerializedName("date_time")
    public String dateTime;
}
