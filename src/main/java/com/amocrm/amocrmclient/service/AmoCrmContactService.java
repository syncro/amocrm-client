package com.amocrm.amocrmclient.service;


import com.amocrm.amocrmclient.entity.AuthResponse;
import com.amocrm.amocrmclient.entity.CustomField;
import com.amocrm.amocrmclient.entity.CustomFieldValue;
import com.amocrm.amocrmclient.entity.account.AccountsDataResponse;
import com.amocrm.amocrmclient.entity.account.CustomFieldSettings;
import com.amocrm.amocrmclient.entity.contact.AddContactResponse;
import com.amocrm.amocrmclient.entity.contact.SetContact;
import com.amocrm.amocrmclient.entity.contact.SetContactAdd;
import com.amocrm.amocrmclient.entity.contact.SetContactRequest;
import com.amocrm.amocrmclient.entity.contact.SetContactRequestContacts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Component
public class AmoCrmContactService {

    private static final Logger logger = LoggerFactory.getLogger(AmoCrmContactService.class);

    AmoCrmAuthService authService;

    AmoCrmAccountService amoCrmAccountService;

    @Inject public AmoCrmContactService(AmoCrmAuthService authService, AmoCrmAccountService amoCrmAccountService) {
        this.authService = authService;
        this.amoCrmAccountService = amoCrmAccountService;
    }


    public SetContact createContact(String name) {

        SetContact setContact = new SetContact();
        setContact.request = new SetContactRequest();
        setContact.request.contacts = new SetContactRequestContacts();
        setContact.request.contacts.add = new ArrayList<>();
        SetContactAdd setContactAdd = new SetContactAdd();
        setContactAdd.name = name;
        setContact.request.contacts.add.add(setContactAdd);

        return setContact;
    }

    public SetContact setContactCustomFields(SetContact setContact, Map<String, String> projectSettings,
                                             Map<String, String> fieldValues, Long linkedLeadId) {

        OkHttpClient httpClient = getOkHttpClient();

        Response<AccountsDataResponse> accountsDataResponse = amoCrmAccountService.data(httpClient, projectSettings);

        if (accountsDataResponse.isSuccessful()) {

            List<CustomFieldSettings> customFields =
                    accountsDataResponse.body().response.account.customFields.contacts;

            Map<String, CustomFieldSettings> customFieldsMap = new HashMap<>();

            for (CustomFieldSettings customField : customFields) {
                customFieldsMap.put(customField.name, customField);
            }

            if (linkedLeadId != null) {
                setContact.request.contacts.add.get(0).linkedLeadsId = new ArrayList<>();
                setContact.request.contacts.add.get(0).linkedLeadsId.add(linkedLeadId);
            }

            setContact.request.contacts.add.get(0).customFields = new ArrayList<>();
            for (String fieldName : fieldValues.keySet()) {
                CustomFieldSettings customFieldSettings = customFieldsMap.get(fieldName);
                if ("Y".equals(customFieldSettings.multiple)) {
                    CustomField customField = new CustomField();
                    customField.id = customFieldsMap.get(fieldName).id;
                    customField.values = new ArrayList<>();
                    CustomFieldValue fieldValue = new CustomFieldValue();
                    fieldValue.value = fieldValues.get(fieldName);
                    customField.values.add(fieldValue);
                    if ("Phone".equals(fieldName)) {
                        fieldValue.enumer = "MOB";
                    } else if ("Email".equals(fieldName)) {
                        fieldValue.enumer = "WORK";
                    }
                    setContact.request.contacts.add.get(0).customFields.add(customField);
                } else {

                }


            }
            return setContact;
        }
        return null;
    }

    public Response<AddContactResponse> setContact(SetContact setContact, Map<String, String> projectSettings) {

        OkHttpClient httpClient = getOkHttpClient();

        Call<AuthResponse> authResponse = authService.auth(httpClient, projectSettings.get("amoCrmHost"),
                projectSettings.get("amoCrmUser"),  projectSettings.get("amoCrmPassword"));

        Response response = null;
        try {
            response = authResponse.execute();
            if (response.isSuccessful()) {

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(projectSettings.get("amoCrmHost"))
                        .client(httpClient)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .build();

                IContactAPI contactAPI = retrofit.create(IContactAPI.class);

                return contactAPI.setContact(setContact).execute();
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error placing the lead", e);
        }
        return null;
    }

    private OkHttpClient getOkHttpClient() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.addInterceptor(logging);

        CookieHandler cookieHandler = new CookieManager();
        JavaNetCookieJar jncj = new JavaNetCookieJar(cookieHandler);

        httpClientBuilder.cookieJar(jncj);
        httpClientBuilder.build();

        return httpClientBuilder.build();
    }
}
