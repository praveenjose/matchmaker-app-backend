package com.heartbeats.matchmaker.model;

import java.util.Arrays;

public class Profile {
    private String firstname;
    private String lastname;
    private String gender;
    private String[] pictures;
    private String mainpicture;
    private String email;
    private String insta_id;
    private String tags;
    private String[] interestedin;
    private String bio;
    private int age;
    private String location;
    private String heightInCm;
    private String profession;

    public Profile() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getPictures() {
        return pictures;
    }

    public void setPictures(String[] pictures) {
        this.pictures = pictures;
    }

    public String getMainpicture() {
        return mainpicture;
    }

    public void setMainpicture(String main_picture) {
        this.mainpicture = main_picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInsta_id() {
        return insta_id;
    }

    public void setInsta_id(String insta_id) {
        this.insta_id = insta_id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String[] getInterestedin() {
        return interestedin;
    }

    public void setInterestedin(String[] interestedin) {
        this.interestedin = interestedin;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(String heightInCm) {
        this.heightInCm = heightInCm;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", pictures=" + Arrays.toString(pictures) +
                ", main_picture='" + mainpicture + '\'' +
                ", email='" + email + '\'' +
                ", insta_id='" + insta_id + '\'' +
                ", tags='" + tags + '\'' +
                ", interestedin=" + Arrays.toString(interestedin) +
                ", bio='" + bio + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", heightInCm='" + heightInCm + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
