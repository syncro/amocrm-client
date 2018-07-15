package com.amocrm.amocrmclient.event.impl;


import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.event.EventClient;
import com.amocrm.amocrmclient.event.entity.LNResponseData;
import com.amocrm.amocrmclient.event.entity.SNAdd;
import com.amocrm.amocrmclient.event.entity.SNParam;
import com.amocrm.amocrmclient.event.entity.SNRequest;
import com.amocrm.amocrmclient.event.entity.SNRequestNotes;
import com.amocrm.amocrmclient.event.entity.SNResponseData;
import com.amocrm.amocrmclient.iface.IEventAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

class EventClientImpl implements EventClient, WithAuthClient {

    private AuthClient authClient;

    private IEventAPI eventAPI;

    public EventClientImpl(AuthClient authClient, IEventAPI eventAPI) {
        this.authClient = authClient;
        this.eventAPI = eventAPI;
    }

    public IEventAPI api() {
        return eventAPI;
    }

    public SNParam createNote() {

        SNParam setNote = new SNParam();
        SNRequest request = new SNRequest();
        SNRequestNotes notes = new SNRequestNotes();
        List<SNAdd> snAdds = new ArrayList<>();
        notes.setAdd(snAdds);
        request.setNotes(notes);
        setNote.setRequest(request);

        return setNote;

    }

    public Response<SNResponseData> setNote(SNParam setNote) throws IOException {

        return eventAPI.setNote(setNote).execute();

    }

    public Response<LNResponseData> listByType(String type, int limitRows, int limitOffset) throws IOException {

        return eventAPI.listByType(type, limitRows, limitOffset).execute();

    }

    public Response<LNResponseData> listByType(String type) throws IOException {

        return eventAPI.listByType(type).execute();

    }

    public Response<LNResponseData> list() throws IOException {

        return eventAPI.list().execute();

    }


    public Response<LNResponseData> list(int limitRows) throws IOException {

        return list(null, null, null, limitRows, -1);

    }

    public Response<LNResponseData> list(int limitRows, int limitOffset) throws IOException {

        return list(null, null, null, limitRows, limitOffset);

    }

    @AuthWithClient
    public Response<LNResponseData> list(Long id, String type, Long elementId, int limitRows, int limitOffset) throws IOException {

        if (type != null) {

            if (limitRows >= 0 && limitOffset >= 0) {
                return eventAPI.listByType(type, limitRows, limitOffset).execute();
            } else if (limitRows >= 0) {
                return eventAPI.listByType(type, limitRows).execute();
            }

            return eventAPI.listByType(type).execute();

        } else if (id != null) {

            return eventAPI.list(id).execute();

        } else if (elementId != null) {

            return eventAPI.listByElementId(elementId).execute();

        } else {

            if (limitRows >= 0 && limitOffset >= 0) {
                return eventAPI.list(limitRows, limitOffset).execute();
            } else if (limitRows >= 0) {
                return eventAPI.list(limitRows).execute();
            }

            return eventAPI.list().execute();

        }

    }

    public Response<LNResponseData> listByElementId(Long elementId) throws IOException {

            return eventAPI.listByElementId(elementId).execute();

    }

    @Override
    public AuthClient getAuthClient() {

        return authClient;

    }
}
