package com.example.chocolatefactorycrew.data.workerdata;

import android.media.Image;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

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