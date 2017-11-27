package com.amocrm.amocrmclient.event.entity;

public class SNParam {

    public SNRequest request;

    public SNParam addNote(SNAdd note) {
        this.getRequest().getNotes().getAdd().add(note);
        return this;
    }

    public SNParam addNote(String text, String noteType, int elementType, int elementId, int dateCreate, int lastModified, String responsibleUserId) {
        return this.addNote(new SNAdd(elementId, elementType, noteType, text,
                dateCreate, lastModified, null, responsibleUserId));
    }


    public SNRequest getRequest() {
        return request;
    }

    public void setRequest(SNRequest request) {
        this.request = request;
    }
}