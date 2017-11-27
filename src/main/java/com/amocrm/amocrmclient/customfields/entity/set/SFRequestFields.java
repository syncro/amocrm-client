package com.amocrm.amocrmclient.customfields.entity.set;


import java.util.List;

public class SFRequestFields {

    public List<SFAdd> add;

    public List<SFDelete> delete;

    public List<SFAdd> getAdd() {
        return add;
    }

    public void setAdd(List<SFAdd> add) {
        this.add = add;
    }

    public List<SFDelete> getDelete() {
        return delete;
    }

    public void setDelete(List<SFDelete> delete) {
        this.delete = delete;
    }
}
