package com.ns.yc.lifehelper.db.cache;

import io.realm.RealmObject;


public class SelectUnFollow extends RealmObject {
    private int id;
    private String name;
    private int index;
    private String logo;


    public SelectUnFollow() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
