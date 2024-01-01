package com.soft.RestApi.entity;

import java.util.List;

public class Student {
    private List<Data> data;
    private  String status;
    private  String message;

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }



    public Student() {
        super();
    }

    public Student(String status, String message, List<Data> data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }


    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + status + '\'' +
                ", lastName='" + message + '\'' +
                '}';
    }
}
