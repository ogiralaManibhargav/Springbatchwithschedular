package com.example.springscheduler.controller;

import com.example.springscheduler.quartz.EmailJob;
import com.example.springscheduler.request.EmailRequest;
import com.example.springscheduler.request.EmailResponse;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

@RestController
public class Controller {
/*
    @Autowired
    private Scheduler scheduler;
//job detail

    @PostMapping("/schedule/email")
    public ResponseEntity<EmailResponse> scheduleEmail(@Valid @RequestBody EmailRequest emailRequest)
    {
       try {
           ZonedDateTime dateTime=ZonedDateTime.of(emailRequest.getDateTime(),emailRequest.getTimeZone());
           if(dateTime.isBefore(ZonedDateTime.now()))// if user scheduled at past
           {
               EmailResponse emailResponse = new EmailResponse(false,"Date Time must be after current time");
               return   ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(emailResponse);

           }
           JobDetail jobDetail= buildJobDetail(emailRequest);
           Trigger trigger = buildTrigger(jobDetail,dateTime);
           scheduler.scheduleJob(jobDetail,trigger);
           EmailResponse emailResponse = new EmailResponse(true,"Email scheduled Sucessfully");
           return   ResponseEntity.status(HttpStatus.OK).body(emailResponse);
       }
       catch (SchedulerException schedulerException)
       {
                  EmailResponse emailResponse = new EmailResponse(false,"Error while scheduling mail. Please try again later");
                  return   ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(emailResponse);
       }
    }

    private JobDetail buildJobDetail(EmailRequest emailRequest)
    {
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("email",emailRequest.getEmail());
        jobDataMap.put("subject",emailRequest.getSubject());
        jobDataMap.put("body",emailRequest.getBody());

        return JobBuilder.newJob(EmailJob.class).withIdentity(UUID.randomUUID().toString(),"email-job")
                .withDescription("Send Email job").storeDurably().build();
    }

    private Trigger buildTrigger(JobDetail jobDetail, ZonedDateTime startAt)
    {
        return TriggerBuilder.newTrigger().forJob(jobDetail).withIdentity(jobDetail.getKey()
                .getName(),"email-triggers").withDescription("Send Email job")
                .startAt(Date.from(startAt.toInstant()))
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withMisfireHandlingInstructionFireNow())
                .build();


    }
*/
    @GetMapping("/")
    public String hello()
    {
        return "Hello";
    }
}
