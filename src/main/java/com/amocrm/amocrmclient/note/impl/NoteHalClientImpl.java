package com.amocrm.amocrmclient.note.impl;


import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.iface.INoteHalAPI;
import com.amocrm.amocrmclient.note.NoteHalClient;
import com.amocrm.amocrmclient.note.entity.Note;
import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;

import retrofit2.Response;

import java.io.IOException;

class NoteHalClientImpl implements NoteHalClient, WithAuthClient {

    private AuthClient authClient;

    private INoteHalAPI noteAPI;

    public NoteHalClientImpl(AuthClient authClient, INoteHalAPI noteAPI) {
        this.authClient = authClient;
        this.noteAPI = noteAPI;
    }

    public INoteHalAPI api() {
        return noteAPI;
    }

    @Override
    public Response<HalResponse<AddOrUpdResponse>> addOrUpdate(AddOrUpdate<Note> addNote) throws IOException {
        return noteAPI.addOrUpdate(addNote).execute();
    }

    @Override
    public Response<HalResponse<Note>> list() throws IOException {
        return this.list(null, null, null, null, -1, -1);
    }

    @Override
    public Response<HalResponse<Note>> list(int limitRows) throws IOException {
        return this.list(null, null, null, null, limitRows, -1);
    }

    @Override
    public Response<HalResponse<Note>> list(int limitRows, int limitOffset) throws IOException {
        return this.list(null, null, null, null, limitRows, limitOffset);
    }

    @Override
    public Response<HalResponse<Note>> list(String type) throws IOException {
        return this.list(null, null, null, type, -1, -1);
    }

    @Override
    public Response<HalResponse<Note>> list(String type, int limitRows, int limitOffset) throws IOException {
        return this.list(null, null, null, type, limitRows, limitOffset);
    }

    @Override
    public Response<HalResponse<Note>> list(Long id, Long elementId, Long[] responsibleUserId, String type, int limitRows, int limitOffset) throws IOException {

        if (id != null) {

            return noteAPI.list(id).execute();

        } else if (responsibleUserId != null) {

            return noteAPI.listByResponsibleUserId(responsibleUserId).execute();


        } else if (responsibleUserId != null) {

            if (limitRows >= 0 && limitOffset >= 0) {

                return noteAPI.listByResponsibleUserId(responsibleUserId, limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return noteAPI.listByResponsibleUserId(responsibleUserId, limitRows).execute();

            }

            return noteAPI.listByResponsibleUserId(responsibleUserId).execute();

        } else if (type != null) {

            if (limitRows >= 0 && limitOffset >= 0) {

                return noteAPI.listByType(type, limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return noteAPI.listByType(type, limitRows).execute();

            }

            return noteAPI.listByType(type).execute();

        } else {

            if (limitRows >= 0 && limitOffset >= 0) {

                return noteAPI.list(limitRows, limitOffset).execute();

            } else if (limitRows >= 0) {

                return noteAPI.list(limitRows).execute();

            }

            return noteAPI.list().execute();
        }
    }

    @Override
    public Response<HalResponse<Note>> listByResponsibleUserId(Long[] responsibleUserIds) throws IOException {
        return null;
    }

    @Override
    public Response<HalResponse<Note>> listByResponsibleUserId(Long[] responsibleUserIds, int limitRows, int limitOffset) throws IOException {
        return null;
    }

    @Override
    public Response<HalResponse<Note>> listByElementId(String elementId) throws IOException {
        return null;
    }

    @Override
    public Response<HalResponse<Note>> listByType(String type) throws IOException {
        return noteAPI.listByType(type).execute();
    }

    @Override
    public AuthClient getAuthClient() {
        return authClient;

    }
}
