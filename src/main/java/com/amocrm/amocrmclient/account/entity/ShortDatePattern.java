package com.amocrm.amocrmclient.account.entity;


import com.google.gson.annotations.SerializedName;

public class ShortDatePattern {

    public String date;

    public String time;

    @SerializedName("date_time")
    public String dateTime;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
