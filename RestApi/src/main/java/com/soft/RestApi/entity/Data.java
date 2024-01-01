package com.soft.RestApi.entity;

public class Data {

    private int id;
    private String email;
    private String name;


    public Data(int id, String email,String name) {
        this.id = id;
        this.email = email;
        this.name=name;
    }

    public Data() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
