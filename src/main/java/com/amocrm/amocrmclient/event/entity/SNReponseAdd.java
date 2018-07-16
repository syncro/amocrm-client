package com.amocrm.amocrmclient.event.entity;

import com.google.gson.annotations.SerializedName;

/**
 * /private/api/v2/json/notes/set -- $.response.notes.add
 */
public class SNReponseAdd {

    public Long id;

    @SerializedName("request_id")
    public Long requestId;
}
