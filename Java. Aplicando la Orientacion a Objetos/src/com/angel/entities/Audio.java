package com.angel.entities;

import java.sql.Array;

public class Audio {
    private String title;
    private int duration;
    private int totalReproductions;
    private String[] format = new String[];

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }
}
