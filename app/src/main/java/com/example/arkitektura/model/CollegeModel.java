package com.example.arkitektura.model;

public class CollegeModel {
    private int imageRes;
    private int logoRes;
    private String name;

    public CollegeModel(int imageRes, int logoRes, String name) {
        this.imageRes = imageRes;
        this.logoRes = logoRes;
        this.name = name;
    }

    public int getImageRes() { return imageRes; }
    public int getLogoRes() { return logoRes; }
    public String getName() { return name; }
}

