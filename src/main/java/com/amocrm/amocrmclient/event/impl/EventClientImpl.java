package com.amocrm.amocrmclient.event.impl;


import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.entity.AuthResponse;
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

import lombok.AllArgsConstructor;
import retrofit2.Call;
import retrofit2.Response;

@AllArgsConstructor
class EventClientImpl implements EventClient {

    private AuthClient authClient;

    private IEventAPI eventAPI;

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

        Call<AuthResponse> authResponse = authClient.auth();

        Response response = authResponse.execute();

        if (response.isSuccessful()) {

            return eventAPI.setNote(setNote).execute();
        }

        return null;
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

    public Response<LNResponseData> list(Long id, String type, Long elementId, int limitRows, int limitOffset) throws IOException {

        Call<AuthResponse> authRequest = authClient.auth();

        Response response = authRequest.execute();

        if (response.isSuccessful()) {

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

        return null;
    }


    public Response<LNResponseData> listByElementId(Long elementId) throws IOException {
        return eventAPI.listByElementId(elementId).execute();
    }

}
