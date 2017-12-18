package com.amocrm.amocrmclient.task.entity.set;


import com.google.gson.annotations.SerializedName;

public class STAdd {

    /**
     * 	Unique identifier of the contact, company or lead (1 - contact, 2 - lead, 3 - company)
     */
    @SerializedName("element_id")
    public Long elementId;

    /**
     * 	Type of element to be linked (1 - contact, 2 - lead)
     */
    @SerializedName("element_type")
    public int elementType;

    /**
     * Task type from account
     */
    @SerializedName("task_type")
    public int taskType;

    public String text;

    @SerializedName("complete_till")
    public int completeTill;
}
