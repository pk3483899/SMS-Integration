package com.sms.controller;

import com.sms.payload.SmsRequest;
import com.sms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sms")
public class SmsController {
    @Autowired
    private SmsService smsService;

    @PostMapping("/send")
    public String sendSms(@RequestBody SmsRequest smsRequest){
        smsService.sendSms(smsRequest.getTo(), smsRequest.getMessage());
        return "Message sent successfully, please check you phone !!";
    }
}
