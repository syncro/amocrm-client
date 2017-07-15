package com.amocrm.amocrmclient.entity.customer.list;


import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class LCFilter {

    public Long id;

    public LCFilterDate date;

    @SerializedName("next_date")
    public LCFilterDate nextDate;

    @SerializedName("main_user")
    public List<String> mainUser;

    public List<LCFilterTask> tasks;

    public Map<String, String> cf;

}
