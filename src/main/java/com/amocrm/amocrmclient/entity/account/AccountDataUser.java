package com.amocrm.amocrmclient.entity.account;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AccountDataUser {

    public Long id;

    @SerializedName("mail_admin")
    public String mailAdmin;

    public String name;

    @SerializedName("last_name")
    public String lastName;

    public String login;

    @SerializedName("photo_url")
    public String photoUrl;

    @SerializedName("photo_number")
    public String photoNumber;

    public String language;

    @SerializedName("is_admin")
    public String isAdmin;

    @SerializedName("unsorted_access")
    public String unsortedAccess;

    @SerializedName("catalogs_access")
    public String catalogsAccess;

    @SerializedName("group_id")
    public Long groupId;

    @SerializedName("rights_lead_add")
    public String rightsLeadAdd;

    @SerializedName("rights_lead_view")
    public String rightsLeadView;

    @SerializedName("rights_lead_edit")
    public String rightsLeadEdit;

    @SerializedName("rights_lead_delete")
    public String rightsLeadDelete;

    @SerializedName("rights_lead_export")
    public String rightsLeadExport;

    @SerializedName("rights_contact_add")
    public String rightsContactAdd;

    @SerializedName("rights_contact_view")
    public String rightsContactView;

    @SerializedName("rights_contact_edit")
    public String rightsContactEdit;

    @SerializedName("rights_contact_delete")
    public String rightsContactDelete;

    @SerializedName("rights_contact_export")
    public String rightsContactExport;

    @SerializedName("rights_company_add")
    public String rightsCompanyAdd;

    @SerializedName("rights_company_view")
    public String rightsCompanyView;

    @SerializedName("rights_company_edit")
    public String rightsCompanyEdit;

    @SerializedName("rights_company_delete")
    public String rightsCompanyDelete;

    @SerializedName("rights_company_export")
    public String rightsCompanyExport;

    @SerializedName("free_user")
    public boolean freeUser;


}

