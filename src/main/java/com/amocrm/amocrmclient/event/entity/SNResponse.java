package com.amocrm.amocrmclient.event.entity;

/**
 * /private/api/v2/json/notes/set -- $.response
 */
public class SNResponse {
    /**
     * /private/api/v2/json/notes/set -- $.response.notes
     */
    public SNReponseNotes notes;

    public SNReponseNotes getNotes() {
        return notes;
    }

    public void setNotes(SNReponseNotes notes) {
        this.notes = notes;
    }
}
