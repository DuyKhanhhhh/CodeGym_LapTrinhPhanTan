package com.example.javafx2;

public class Class_Student {
    private String id;
    private String name;
    private String classs;
    private String gender;
    private String address;
    private int score;

    public Class_Student(String id, String name, String classs, String gender, String address, int score) {
        this.id = id;
        this.name = name;
        this.classs = classs;
        this.gender = gender;
        this.address = address;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
