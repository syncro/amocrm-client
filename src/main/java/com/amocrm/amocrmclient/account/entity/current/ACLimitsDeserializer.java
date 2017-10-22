package com.amocrm.amocrmclient.account.entity.current;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;


public class ACLimitsDeserializer implements JsonDeserializer<ACLimits> {

    @Override
    public ACLimits deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();

        ACLimits acLimits = new ACLimits();
        try {
            acLimits.usersCount = jsonObject.get("users_count").getAsInt();
        } catch (Exception e) {
            acLimits.usersCount = 0;
        }
        try {
            acLimits.contactsCount = jsonObject.get("contacts_count").getAsInt();
        } catch (Exception e) {
            acLimits.contactsCount = 0;
        }
        try {
            acLimits.activeDealsCount = jsonObject.get("active_deals_count").getAsInt();
        } catch (Exception e) {
            acLimits.activeDealsCount = 0;
        }
        return acLimits;
    }
}