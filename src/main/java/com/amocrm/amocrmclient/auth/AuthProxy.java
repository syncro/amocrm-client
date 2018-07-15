package com.amocrm.amocrmclient.auth;

import com.amocrm.amocrmclient.entity.AuthResponse;
import retrofit2.Call;
import retrofit2.Response;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AuthProxy implements InvocationHandler {

    WithAuthClient impl;

    public AuthProxy(WithAuthClient impl) {
        this.impl = impl;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.isAnnotationPresent(AuthWithClient.class)) {

            Call<AuthResponse> authRequest = this.impl.getAuthClient().auth();

            Response response = authRequest.execute();

            if (response.isSuccessful()) {

                return method.invoke(this.impl, args);
            }
        }

        return null;
    }
}