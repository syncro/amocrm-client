package com.amocrm.amocrmclient.auth.cookie;

import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public class ThreadLocalCookieStore implements CookieStore {

    private final static ThreadLocal<CookieStore> cookieJars = new ThreadLocal<CookieStore>() {
        @Override
        protected synchronized CookieStore initialValue() {
            return (new CookieManager()).getCookieStore();
        }
    };


    public void add(URI uri, HttpCookie cookie) {
        cookieJars.get().add(uri, cookie);
    }

    public List<HttpCookie> get(URI uri) {
        return cookieJars.get().get(uri);
    }

    @Override
    public List<HttpCookie> getCookies() {
        return cookieJars.get().getCookies();
    }

    @Override
    public List<URI> getURIs() {
        return cookieJars.get().getURIs();
    }

    @Override
    public boolean remove(URI uri, HttpCookie cookie) {
        return cookieJars.get().remove(uri, cookie);
    }

    @Override
    public boolean removeAll() {
        return cookieJars.get().removeAll();
    }
}