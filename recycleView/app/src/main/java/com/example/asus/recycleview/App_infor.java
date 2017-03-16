package com.example.asus.recycleview;

/**
 * Created by ASUS on 3/22/2017.
 */

public class App_infor {
    private int source;
    private String name;
    private String company;
    private float star;
    private String state;

    public App_infor(int source, String name, String company, float star, String state) {
        this.source = source;
        this.name = name;
        this.company = company;
        this.star = star;
        this.state = state;
    }

    public int getSource() {
        return source;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public float getStar() {
        return star;
    }

    public String getState() {
        return state;
    }
}
