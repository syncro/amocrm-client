package com.amocrm.amocrmclient.pipeline.impl;


import com.amocrm.amocrmclient.auth.WithAuthClient;
import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.iface.IPipelineAPI;
import com.amocrm.amocrmclient.pipeline.PipelineClient;
import com.amocrm.amocrmclient.pipeline.entity.DPResponseData;
import com.amocrm.amocrmclient.pipeline.entity.LPResponseData;
import com.amocrm.amocrmclient.pipeline.entity.SPParam;
import com.amocrm.amocrmclient.pipeline.entity.SPResponseData;
import retrofit2.Response;

import java.io.IOException;


class PipelineClientImpl implements PipelineClient, WithAuthClient {

    private boolean authenticated = false;

    private AuthClient authClient;

    private IPipelineAPI pipelineAPI;

    public PipelineClientImpl(AuthClient authClient, IPipelineAPI pipelineAPI) {
        this.authClient = authClient;
        this.pipelineAPI = pipelineAPI;
    }

    public IPipelineAPI api() {
        return pipelineAPI;
    }

    public Response<LPResponseData> list(Long id) throws IOException {

        if (id != null) {

            return pipelineAPI.list(id).execute();

        } else {

            return pipelineAPI.list().execute();

        }
    }

    public Response<SPResponseData> setPipeline(SPParam setPipeline) throws IOException {

        return pipelineAPI.setPipeline(setPipeline).execute();
    }

    public Response<LPResponseData> list() throws IOException {

        return this.list(null);
    }

    public Response<DPResponseData> delete(Long id) throws IOException {

        return pipelineAPI.delete(id).execute();
    }

    @Override
    public AuthClient getAuthClient() {

        return authClient;

    }

}
