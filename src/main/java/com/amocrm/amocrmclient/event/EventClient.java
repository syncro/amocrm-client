package com.amocrm.amocrmclient.event;


import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.event.entity.LNResponseData;
import com.amocrm.amocrmclient.event.entity.SNParam;
import com.amocrm.amocrmclient.event.entity.SNResponseData;
import com.amocrm.amocrmclient.iface.IEventAPI;

import java.io.IOException;

import retrofit2.Response;


public interface EventClient {

    IEventAPI api();

    SNParam createNote();

    @AuthWithClient
    Response<SNResponseData> setNote(SNParam setNote) throws IOException;

    Response<LNResponseData> list() throws IOException;

    Response<LNResponseData> list(int limitRows, int limitOffset) throws IOException;

    Response<LNResponseData> list(int limitRows) throws IOException;

    @AuthWithClient
    Response<LNResponseData> list(Long id, String type, Long elementId, int limitRows, int limitOffset) throws IOException;

    /**
     *
     * 	Type of element to be linked (1 - contact, 2 - lead, 3 - company, 4 - task)
     *
     * @param type
     * @return
     * @throws IOException
     */
    Response<LNResponseData> listByType(String type) throws IOException;

    Response<LNResponseData> listByType(String type, int limitRows, int limitOffset) throws IOException;

    @AuthWithClient
    Response<LNResponseData> listByElementId(Long elementId) throws IOException;

}
