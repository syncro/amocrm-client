package com.amocrm.amocrmclient.customfields.entity.set;

import com.google.gson.annotations.SerializedName;

public class SFAdd {

    public String name;

    /**
     *  https://developers.amocrm.com/rest_api/accounts_current.php#type_id
     *
     * 1	TEXT
     * 2	NUMERIC
     * 3	CHECKBOX
     * 4	SELECT
     * 5	MULTISELECT
     * 6	DATE
     * 7	URL
     * 8	MULTITEXT
     * 9	TEXTAREA
     * 10	RADIOBUTTON
     *
     */
    public int type;

    /**
     * 1	Contact
     * 2	Lead
     * 3	Company
     */
    @SerializedName("element_type")
    public int elementType;

    public String origin;

    public int disabled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getElementType() {
        return elementType;
    }

    public void setElementType(int elementType) {
        this.elementType = elementType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }
}
