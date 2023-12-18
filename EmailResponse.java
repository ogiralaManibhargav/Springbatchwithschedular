package com.example.springscheduler.request;

public class EmailResponse {

    private boolean sucess;

    private String jobId;

    private String jobGroup;

    private String message;

    public EmailResponse(boolean sucess, String message) {
        this.sucess = sucess;
        this.message = message;
    }

    public EmailResponse(boolean sucess, String jobId, String jobGroup, String message) {
        this.sucess = sucess;
        this.jobId = jobId;
        this.jobGroup = jobGroup;
        this.message = message;
    }
}
