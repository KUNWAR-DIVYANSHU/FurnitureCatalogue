package com.fardin.furniturecatalogue;

public class FItems {

    private String name;
    private int photoUrl;
    private String description;

    public FItems(String name, int photoUrl, String description) {
        this.name = name;
        this.photoUrl = photoUrl;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(int photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
