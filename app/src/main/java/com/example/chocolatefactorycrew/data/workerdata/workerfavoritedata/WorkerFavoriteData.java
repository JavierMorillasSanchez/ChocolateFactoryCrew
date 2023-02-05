package com.example.chocolatefactorycrew.data.workerdata.workerfavoritedata;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class WorkerFavoriteData implements Serializable {

    @SerializedName("song")
    private String song = "";

    @SerializedName("random_string")
    private String random_string = "";

    @SerializedName("food")
    private String food = "";

    @SerializedName("color")
    private String color = "";

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getRandom_string() {
        return random_string;
    }

    public void setRandom_string(String random_string) {
        this.random_string = random_string;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public WorkerFavoriteData(String song, String random_string, String food, String color) {
        this.song = song;
        this.random_string = random_string;
        this.food = food;
        this.color = color;
    }
}
