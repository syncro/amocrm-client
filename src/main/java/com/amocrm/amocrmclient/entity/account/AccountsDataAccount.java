package com.amocrm.amocrmclient.entity.account;


import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class AccountsDataAccount {

    public Long id;

    public String name;

    public String subdomain;

    public String currency;

    @SerializedName("paid_from")
    public boolean paidFrom;

    @SerializedName("paid_till")
    public boolean paidTill;

    public String timezone;

    public String language;

    @SerializedName("notifications_base_url")
    public String notificationsBaseUrl;

    @SerializedName("notifications_ws_url")
    public String notificationsWsUrl;

    @SerializedName("amojo_base_url")
    public String amojoBaseUrl;

    @SerializedName("current_user")
    public Long currentUser;

    @SerializedName("version")
    public Long version;

    @SerializedName("date_pattern")
    public String datePattern;

    @SerializedName("short_date_pattern")
    public ShortDatePattern shortDatePattern;

    @SerializedName("date_format")
    public String dateFormat;

    @SerializedName("time_format")
    public String timeFormat;

    @SerializedName("country")
    public String country;

    @SerializedName("unsorted_on")
    public String unsortedOn;

    @SerializedName("customers_enabled")
    public boolean customersEnabled;

    public AccountsDataLimits limits;

    public List<AccountDataUser> users;

    //public List<AccoundsDataGroup> groups;

    @SerializedName("leads_statuses")
    public List<LeadStatus> leadsStatuses;

    @SerializedName("custom_fields")
    public CustomFields customFields;

    @SerializedName("note_types")
    public List<NoteType> noteTypes;

    @SerializedName("task_types")
    public List<TaskType> taskTypes;

    public Map<Long, Pipeline> pipelines;

    public String timezoneoffset;

}
