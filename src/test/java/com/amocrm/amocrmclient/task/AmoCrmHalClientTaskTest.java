package com.amocrm.amocrmclient.task;


import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertTrue;


import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.response.HalResponse;
import com.amocrm.amocrmclient.task.entity.Task;
import com.amocrm.amocrmclient.task.impl.TaskHalClientBuilder;

public class AmoCrmHalClientTaskTest extends AmoCrmClientTest {

    private TaskHalClient getTaskClient() {
        Properties properties = getProperties();

        return new TaskHalClientBuilder()
                .baseUrl(properties.getProperty("amocrm.baseurl"))
                .login(properties.getProperty("amocrm.login"))
                .passwordHash(properties.getProperty("amocrm.passwordhash"))
                .build();
    }

    @Test
    @Ignore
    public void testListTask() throws IOException {

        TaskHalClient taskClient = getTaskClient();

        Response<HalResponse<Task>> tasksResponse = taskClient.list(10);

        assertTrue(tasksResponse.body().embedded.items.size() <= 10);
    }

}
