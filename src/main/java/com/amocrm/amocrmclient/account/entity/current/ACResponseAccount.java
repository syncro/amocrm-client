package com.amocrm.amocrmclient.account.entity.current;


import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.account.entity.CustomFields;
import com.amocrm.amocrmclient.account.entity.LeadStatus;
import com.amocrm.amocrmclient.account.entity.NoteType;
import com.amocrm.amocrmclient.account.entity.Pipeline;
import com.amocrm.amocrmclient.account.entity.ShortDatePattern;
import com.amocrm.amocrmclient.account.entity.TaskType;

import java.util.List;
import java.util.Map;

public class ACResponseAccount {

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

    public ACLimits limits;

    public List<ACResponseUser> users;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isPaidFrom() {
        return paidFrom;
    }

    public void setPaidFrom(boolean paidFrom) {
        this.paidFrom = paidFrom;
    }

    public boolean isPaidTill() {
        return paidTill;
    }

    public void setPaidTill(boolean paidTill) {
        this.paidTill = paidTill;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNotificationsBaseUrl() {
        return notificationsBaseUrl;
    }

    public void setNotificationsBaseUrl(String notificationsBaseUrl) {
        this.notificationsBaseUrl = notificationsBaseUrl;
    }

    public String getNotificationsWsUrl() {
        return notificationsWsUrl;
    }

    public void setNotificationsWsUrl(String notificationsWsUrl) {
        this.notificationsWsUrl = notificationsWsUrl;
    }

    public String getAmojoBaseUrl() {
        return amojoBaseUrl;
    }

    public void setAmojoBaseUrl(String amojoBaseUrl) {
        this.amojoBaseUrl = amojoBaseUrl;
    }

    public Long getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Long currentUser) {
        this.currentUser = currentUser;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    public ShortDatePattern getShortDatePattern() {
        return shortDatePattern;
    }

    public void setShortDatePattern(ShortDatePattern shortDatePattern) {
        this.shortDatePattern = shortDatePattern;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUnsortedOn() {
        return unsortedOn;
    }

    public void setUnsortedOn(String unsortedOn) {
        this.unsortedOn = unsortedOn;
    }

    public boolean isCustomersEnabled() {
        return customersEnabled;
    }

    public void setCustomersEnabled(boolean customersEnabled) {
        this.customersEnabled = customersEnabled;
    }

    public ACLimits getLimits() {
        return limits;
    }

    public void setLimits(ACLimits limits) {
        this.limits = limits;
    }

    public List<ACResponseUser> getUsers() {
        return users;
    }

    public void setUsers(List<ACResponseUser> users) {
        this.users = users;
    }

    public List<LeadStatus> getLeadsStatuses() {
        return leadsStatuses;
    }

    public void setLeadsStatuses(List<LeadStatus> leadsStatuses) {
        this.leadsStatuses = leadsStatuses;
    }

    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public List<NoteType> getNoteTypes() {
        return noteTypes;
    }

    public void setNoteTypes(List<NoteType> noteTypes) {
        this.noteTypes = noteTypes;
    }

    public List<TaskType> getTaskTypes() {
        return taskTypes;
    }

    public void setTaskTypes(List<TaskType> taskTypes) {
        this.taskTypes = taskTypes;
    }

    public Map<Long, Pipeline> getPipelines() {
        return pipelines;
    }

    public void setPipelines(Map<Long, Pipeline> pipelines) {
        this.pipelines = pipelines;
    }

    public String getTimezoneoffset() {
        return timezoneoffset;
    }

    public void setTimezoneoffset(String timezoneoffset) {
        this.timezoneoffset = timezoneoffset;
    }
}
