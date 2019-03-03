package com.amocrm.amocrmclient.response;

import java.util.Collection;

public class Embedded<ResponseEntity> {

    public Collection<ResponseEntity> items;

    public Collection<ResponseEntity> getItems() {
        return items;
    }

    public void setItems(Collection<ResponseEntity> items) {
        this.items = items;
    }
}
