package com.example.a16022916.demolistview;

/**
 * Created by 16022916 on 24/4/2018.
 */

public class Food {
    private String name;
    private boolean star;
    public Food(String name, boolean star) {
        this.name = name;
        this.star = star;
    }
    public String getName() {
        return name;
    }
    public boolean isStar() {
        return star;
    }
}
