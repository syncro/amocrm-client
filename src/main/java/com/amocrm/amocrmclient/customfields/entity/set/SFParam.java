package com.amocrm.amocrmclient.customfields.entity.set;



public class SFParam {

    public SFRequest request;

    public SFParam addField(SFAdd field) {
        this.getRequest().getFields().getAdd().add(field);
        return this;
    }

    public SFParam addField(String name, int type, int elementType, String origin, int disabled) {
        return this.addField(new SFAdd(name, type, elementType, origin, disabled));
    }

    public SFRequest getRequest() {
        return request;
    }

    public void setRequest(SFRequest request) {
        this.request = request;
    }
}
