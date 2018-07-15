package com.amocrm.amocrmclient.pipeline;



import com.amocrm.amocrmclient.auth.AuthWithClient;
import com.amocrm.amocrmclient.iface.IPipelineAPI;
import com.amocrm.amocrmclient.pipeline.entity.DPResponseData;
import com.amocrm.amocrmclient.pipeline.entity.LPResponseData;

import java.io.IOException;

import com.amocrm.amocrmclient.pipeline.entity.SPParam;
import com.amocrm.amocrmclient.pipeline.entity.SPResponseData;
import retrofit2.Response;

public interface PipelineClient {

    IPipelineAPI api();

    @AuthWithClient
    Response<LPResponseData> list() throws IOException;

    @AuthWithClient
    Response<LPResponseData> list(Long id) throws IOException;

    Response<SPResponseData> setPipeline(SPParam setPipeline) throws IOException;

    @AuthWithClient
    Response<DPResponseData> delete(Long id) throws IOException;

}
