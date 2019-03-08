package com.amocrm.amocrmclient.lead.entity;

import com.google.gson.annotations.SerializedName;

public class AddIncomingLead {

    public Long id;

    public String from;

    public Integer timestamp;

    public Integer duration;

    public String link;

    @SerializedName("service_code")
    public String serviceCode;

    public String uniq;

    @SerializedName("add_note")
    public Boolean addNote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
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

    public Boolean getAddNote() {
        return addNote;
    }

    public void setAddNote(Boolean addNote) {
        this.addNote = addNote;
    }
}
