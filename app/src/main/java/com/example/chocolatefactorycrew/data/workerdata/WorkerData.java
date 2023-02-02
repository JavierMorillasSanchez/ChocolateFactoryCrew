package com.example.chocolatefactorycrew.data.workerdata;

import android.media.Image;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class WorkerData implements Serializable {

    @SerializedName("first_name")
    private String first_name = "";

    @SerializedName("last_name")
    private String last_name = "";

    @SerializedName("color")
    private String color = "";

    @SerializedName("food")
    private String food = "";

    @SerializedName("random_string")
    private String random_string = "";

    @SerializedName("song")
    private String song = "";

    @SerializedName("gender")
    private String gender = "";

    @SerializedName("image")
    private String image = "";

    @SerializedName("profession")
    private String profession = "";

    @SerializedName("email")
    private String email = "";

    @SerializedName("age")
    private int age = 0;

    @SerializedName("country")
    private String country = "";

    @SerializedName("height")
    private int height;

    @SerializedName("id")
    private String id;

    @SerializedName("quota")
    private String quota;

    /*
    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    @SerializedName("favorite")
    private String favorite = "";

     */

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getRandom_string() {
        return random_string;
    }

    public void setRandom_string(String random_string) {
        this.random_string = random_string;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }
}