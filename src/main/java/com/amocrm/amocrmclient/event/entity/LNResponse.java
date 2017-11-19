package com.amocrm.amocrmclient.event.entity;

import java.util.List;

public class LNResponse {

    public List<Note> notes;

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
