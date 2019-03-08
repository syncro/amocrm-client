package com.amocrm.amocrmclient.lead.entity;

import com.google.gson.annotations.SerializedName;

public class IncomingLeadInfo {

    public String to;

    public String from;

    @SerializedName("date_call")
    public String dateCall;

    public String duration;

    public String link;

    @SerializedName("service_code")
    public String serviceCode;

    @SerializedName("uniq")
    public String uniq;

    @SerializedName("add_note")
    public String addNote;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDateCall() {
        return dateCall;
    }

    public void setDateCall(String dateCall) {
        this.dateCall = dateCall;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getUniq() {
        return uniq;
    }

    public void setUniq(String uniq) {
        this.uniq = uniq;
    }

    public String getAddNote() {
        return addNote;
    }

    public void setAddNote(String addNote) {
        this.addNote = addNote;
    }
}