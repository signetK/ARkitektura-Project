package com.example.arkitektura.model;

import com.example.arkitektura.model.CollegeModel;

public class CollegeModel {
    private final int imageRes;
    private final int logoRes;
    private final String name;
    private final String history;
    private final String info;

    public CollegeModel(int imageRes, int logoRes, String name, String history, String info) {
        this.imageRes = imageRes;
        this.logoRes = logoRes;
        this.name = name;
        this.history = history;
        this.info = info;
    }

    public int getImageRes() { return imageRes; }
    public int getLogoRes() { return logoRes; }
    public String getName() { return name; }
    public String getHistory() { return history; }
    public String getInfo() { return info; }
}


