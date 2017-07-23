package com.amocrm.amocrmclient.account;


import com.amocrm.amocrmclient.account.entity.current.ACData;
import com.amocrm.amocrmclient.iface.IAccountAPI;

import java.io.IOException;

import retrofit2.Response;

public interface AccountClient {

    IAccountAPI api();

    Response<ACData> data() throws IOException;
}
