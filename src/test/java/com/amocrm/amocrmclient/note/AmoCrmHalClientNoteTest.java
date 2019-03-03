package com.amocrm.amocrmclient.note;


import com.amocrm.amocrmclient.AmoCrmClientTest;
import com.amocrm.amocrmclient.note.entity.Note;
import com.amocrm.amocrmclient.note.impl.NoteHalClientBuilder;
import com.amocrm.amocrmclient.response.HalResponse;

import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class AmoCrmHalClientNoteTest extends AmoCrmClientTest {

    private NoteHalClient getNoteClient() {
        Properties properties = getProperties();

        return new NoteHalClientBuilder()
                .baseUrl(properties.getProperty("amocrm.baseurl"))
                .login(properties.getProperty("amocrm.login"))
                .passwordHash(properties.getProperty("amocrm.passwordhash"))
                .build();
    }

    @Test
    @Ignore
    public void testListNotes() throws IOException {

        NoteHalClient noteClient = getNoteClient();

        Response<HalResponse<Note>> notesResponse = noteClient.list(10);

        assertTrue(notesResponse.body().embedded.items.size() <= 10);
    }

}
