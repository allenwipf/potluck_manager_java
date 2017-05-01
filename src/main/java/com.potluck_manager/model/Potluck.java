package com.potluck_manager.model;


public class Potluck {
    private int pId;
    private String title;
    private String location;
    private String description;
    private int party_size;

//
//    public Potluck(int pId, String title, String location, String description, int party_size) {
//        this.pId = pId;
//        this.title = title;
//        this.location = location;
//        this.description = description;
//        this.party_size = party_size;
//    }


    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getParty_size() {
        return party_size;
    }

    public void setParty_size(int party_size) {
        this.party_size = party_size;
    }
}






