package com.amocrm.amocrmclient.event.entity;


import com.google.gson.annotations.SerializedName;

public class SNAdd {

    @SerializedName("element_id")
    public int elementId;

    /**
     * 	Type of element to be linked (1 - contact, 2 - lead, 3 - company, 4 - task)
     */
    @SerializedName("element_type")
    public int elementType;

    /**
     *

     1	Lead created
     2	Contact created
     3	Lead status modified
     4	Standard note
     5	File
     6	Call made from iPhone applications
     7	Unused
     8	Unused
     9	Unused
     10	Inbound call
     11	Outbound call
     12	Company created
     13	Task result
     102	Inbound SMS
     103	Outbound SMS

     */
    @SerializedName("note_type")
    public String noteType;

    @SerializedName("date_create")
    public int dateCreate;

    @SerializedName("request_id")
    public Long requestId;

    @SerializedName("last_modified")
    public int lastModified;

    @SerializedName("text")
    public String text;

    @SerializedName("responsible_user_id")
    public String responsibleUserId;

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public int getElementType() {
        return elementType;
    }

    public void setElementType(int elementType) {
        this.elementType = elementType;
    }

    public int getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(int dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public int getLastModified() {
        return lastModified;
    }

    public void setLastModified(int lastModified) {
        this.lastModified = lastModified;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    public String getResponsibleUserId() {
        return responsibleUserId;
    }

    public void setResponsibleUserId(String responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }
}
