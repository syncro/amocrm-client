package com.amocrm.amocrmclient.account.entity.current;


import com.google.gson.annotations.SerializedName;


public class ACResponseUser {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMailAdmin() {
        return mailAdmin;
    }

    public void setMailAdmin(String mailAdmin) {
        this.mailAdmin = mailAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPhotoNumber() {
        return photoNumber;
    }

    public void setPhotoNumber(String photoNumber) {
        this.photoNumber = photoNumber;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getUnsortedAccess() {
        return unsortedAccess;
    }

    public void setUnsortedAccess(String unsortedAccess) {
        this.unsortedAccess = unsortedAccess;
    }

    public String getCatalogsAccess() {
        return catalogsAccess;
    }

    public void setCatalogsAccess(String catalogsAccess) {
        this.catalogsAccess = catalogsAccess;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getRightsLeadAdd() {
        return rightsLeadAdd;
    }

    public void setRightsLeadAdd(String rightsLeadAdd) {
        this.rightsLeadAdd = rightsLeadAdd;
    }

    public String getRightsLeadView() {
        return rightsLeadView;
    }

    public void setRightsLeadView(String rightsLeadView) {
        this.rightsLeadView = rightsLeadView;
    }

    public String getRightsLeadEdit() {
        return rightsLeadEdit;
    }

    public void setRightsLeadEdit(String rightsLeadEdit) {
        this.rightsLeadEdit = rightsLeadEdit;
    }

    public String getRightsLeadDelete() {
        return rightsLeadDelete;
    }

    public void setRightsLeadDelete(String rightsLeadDelete) {
        this.rightsLeadDelete = rightsLeadDelete;
    }

    public String getRightsLeadExport() {
        return rightsLeadExport;
    }

    public void setRightsLeadExport(String rightsLeadExport) {
        this.rightsLeadExport = rightsLeadExport;
    }

    public String getRightsContactAdd() {
        return rightsContactAdd;
    }

    public void setRightsContactAdd(String rightsContactAdd) {
        this.rightsContactAdd = rightsContactAdd;
    }

    public String getRightsContactView() {
        return rightsContactView;
    }

    public void setRightsContactView(String rightsContactView) {
        this.rightsContactView = rightsContactView;
    }

    public String getRightsContactEdit() {
        return rightsContactEdit;
    }

    public void setRightsContactEdit(String rightsContactEdit) {
        this.rightsContactEdit = rightsContactEdit;
    }

    public String getRightsContactDelete() {
        return rightsContactDelete;
    }

    public void setRightsContactDelete(String rightsContactDelete) {
        this.rightsContactDelete = rightsContactDelete;
    }

    public String getRightsContactExport() {
        return rightsContactExport;
    }

    public void setRightsContactExport(String rightsContactExport) {
        this.rightsContactExport = rightsContactExport;
    }

    public String getRightsCompanyAdd() {
        return rightsCompanyAdd;
    }

    public void setRightsCompanyAdd(String rightsCompanyAdd) {
        this.rightsCompanyAdd = rightsCompanyAdd;
    }

    public String getRightsCompanyView() {
        return rightsCompanyView;
    }

    public void setRightsCompanyView(String rightsCompanyView) {
        this.rightsCompanyView = rightsCompanyView;
    }

    public String getRightsCompanyEdit() {
        return rightsCompanyEdit;
    }

    public void setRightsCompanyEdit(String rightsCompanyEdit) {
        this.rightsCompanyEdit = rightsCompanyEdit;
    }

    public String getRightsCompanyDelete() {
        return rightsCompanyDelete;
    }

    public void setRightsCompanyDelete(String rightsCompanyDelete) {
        this.rightsCompanyDelete = rightsCompanyDelete;
    }

    public String getRightsCompanyExport() {
        return rightsCompanyExport;
    }

    public void setRightsCompanyExport(String rightsCompanyExport) {
        this.rightsCompanyExport = rightsCompanyExport;
    }

    public boolean isFreeUser() {
        return freeUser;
    }

    public void setFreeUser(boolean freeUser) {
        this.freeUser = freeUser;
    }
}

