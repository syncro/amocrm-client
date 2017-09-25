package com.amocrm.amocrmclient.customer.entity.set;


import com.google.gson.annotations.SerializedName;

import com.amocrm.amocrmclient.entity.CustomField;

import java.util.List;


public class SCAdd {

    @SerializedName("main_user_id")
    public Long mainUserId;

    public String name;

    @SerializedName("next_price")
    public int nextPrice;

    @SerializedName("next_date")
    public int nextDate;

    public int periodicity;

    @SerializedName("custom_fields")
    public List<CustomField> customFields;

    public Long getMainUserId() {
        return mainUserId;
    }

    public void setMainUserId(Long mainUserId) {
        this.mainUserId = mainUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNextPrice() {
        return nextPrice;
    }

    public void setNextPrice(int nextPrice) {
        this.nextPrice = nextPrice;
    }

    public int getNextDate() {
        return nextDate;
    }

    public void setNextDate(int nextDate) {
        this.nextDate = nextDate;
    }

    public int getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }
}
