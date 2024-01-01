package com.soft.RestApi.exception;

public class StudentErrorResponse {
//    git push -u origin main

    private  int status;
    private  String message;
    private  long timeStemp;

    public StudentErrorResponse() {

    }

    public StudentErrorResponse(int status, String message, long timeStemp) {
        this.status = status;
        this.message = message;
        this.timeStemp = timeStemp;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public long getTimeStemp() {
        return timeStemp;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimeStemp(long timeStemp) {
        this.timeStemp = timeStemp;
    }
}
