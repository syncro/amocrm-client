package com.amocrm.amocrmclient.pipeline.impl;


import com.amocrm.amocrmclient.auth.AuthClient;
import com.amocrm.amocrmclient.entity.AuthResponse;
import com.amocrm.amocrmclient.iface.IPipelineAPI;
import com.amocrm.amocrmclient.pipeline.PipelineClient;
import com.amocrm.amocrmclient.pipeline.entity.DPResponseData;
import com.amocrm.amocrmclient.pipeline.entity.LPResponseData;
import com.amocrm.amocrmclient.pipeline.entity.SPParam;
import com.amocrm.amocrmclient.pipeline.entity.SPResponseData;
import lombok.AllArgsConstructor;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;


@AllArgsConstructor
class PipelineClientImpl implements PipelineClient {

    private AuthClient authClient;

    private IPipelineAPI pipelineAPI;

    public IPipelineAPI api() {
        return pipelineAPI;
    }


    public Response<LPResponseData> list(Long id) throws IOException {

        Call<AuthResponse> authRequest = authClient.auth();

        Response response = authRequest.execute();

        if (response.isSuccessful()) {

            if (id != null) {

                return pipelineAPI.list(id).execute();

            } else {

                return pipelineAPI.list().execute();

            }
        }
        return null;
    }

    public Response<SPResponseData> setPipeline(SPParam setPipeline) throws IOException {

        Call<AuthResponse> authResponse = authClient.auth();

        Response response = authResponse.execute();

        if (response.isSuccessful()) {

            return pipelineAPI.setPipeline(setPipeline).execute();
        }

        return null;
    }

    public Response<LPResponseData> list() throws IOException {

        return this.list(null);

    }

    public Response<DPResponseData> delete(Long id) throws IOException {

        return pipelineAPI.delete(id).execute();

    }

}
