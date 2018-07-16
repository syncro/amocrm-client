package com.amocrm.amocrmclient.event.entity;

import java.util.List;

/**
 * /private/api/v2/json/notes/set -- $.response.notes
 */
public class SNReponseNotes {
    /**
     * /private/api/v2/json/notes/set -- $.response.notes.add
     */
    public List<SNReponseAdd> add;

    public List<SNReponseAdd> getAdd() {
        return add;
    }

    public void setAdd(List<SNReponseAdd> add) {
        this.add = add;
    }
}
