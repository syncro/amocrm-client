package com.amocrm.amocrmclient.entity.customer;


import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class ListCustomersFilter {

    public Long id;

    public ListCustomersFilterDate date;

    @SerializedName("next_date")
    public ListCustomersFilterDate nextDate;

    @SerializedName("main_user")
    public List<String> mainUser;

    public List<ListCustomerFilterTask> tasks;

    public Map<String, String> cf;

}
