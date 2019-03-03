package com.amocrm.amocrmclient.note;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.iface.INoteHalAPI;
import com.amocrm.amocrmclient.note.entity.Note;
import com.amocrm.amocrmclient.request.AddOrUpdate;
import com.amocrm.amocrmclient.response.AddOrUpdResponse;
import com.amocrm.amocrmclient.response.HalResponse;

import retrofit2.Response;
import retrofit2.http.Body;

import java.io.IOException;


public interface NoteHalClient {

    INoteHalAPI api();

    @AuthWithClient
    Response<HalResponse<AddOrUpdResponse>> addOrUpdate(@Body AddOrUpdate<Note> addNote) throws IOException;

    @AuthWithClient
    Response<HalResponse<Note>> list() throws IOException;

    @AuthWithClient
    Response<HalResponse<Note>> list(int limitRows) throws IOException;

    @AuthWithClient
    Response<HalResponse<Note>> list(int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Note>> list(String type) throws IOException;

    @AuthWithClient
    Response<HalResponse<Note>> list(String type, int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Note>> list(Long id, Long elementId, Long[] responsibleUserId, String type, int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Note>> listByResponsibleUserId(Long[] responsibleUserIds) throws IOException;

    @AuthWithClient
    Response<HalResponse<Note>> listByResponsibleUserId(Long[] responsibleUserIds, int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<HalResponse<Note>> listByElementId(String elementId) throws IOException;

    @AuthWithClient
    Response<HalResponse<Note>> listByType(String elementId) throws IOException;
}
