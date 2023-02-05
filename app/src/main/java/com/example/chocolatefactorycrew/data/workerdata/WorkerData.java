package com.example.chocolatefactorycrew.data.workerdata;

import android.media.Image;

import com.example.chocolatefactorycrew.data.workerdata.workerfavoritedata.WorkerFavoriteData;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class WorkerData implements Serializable {

    @SerializedName("first_name")
    private String first_name = "";

    @SerializedName("last_name")
    private String last_name = "";

    @SerializedName("image")
    private String image = "";

    @SerializedName("email")
    private String email = "";

    @SerializedName("profession")
    private String profession;

    @SerializedName("id")
    private String id;

    @SerializedName("description")
    private String description = "";

    @SerializedName("quota")
    private String quota = "";

    @SerializedName("height")
    private int height = 0;

    @SerializedName("country")
    private String country = "";

    @SerializedName("age")
    private int age = 0;

    @SerializedName("gender")
    private String gender = "";

    @SerializedName("favorite")
    public WorkerFavoriteData workerFavoriteData  = null;

    public WorkerFavoriteData getWorkerFavoriteData() {
        return workerFavoriteData;
    }

    public void setWorkerFavoriteData(WorkerFavoriteData workerFavoriteData) {
        this.workerFavoriteData = workerFavoriteData;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullName(){
        return this.first_name+" "+this.last_name;
    }

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}