package com.ClarityPlusPackage.RecipientMService.Service.Implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailConfig {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendOTPMail(String to, String subject, String body)  {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("yasha.dayal145@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        System.out.println(message);
        System.out.println(javaMailSender);
        javaMailSender.send(message);
        System.out.println("Mail sent!");
    }
}