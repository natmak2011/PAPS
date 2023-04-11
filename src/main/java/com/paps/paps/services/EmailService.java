package com.paps.paps.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailService {


    @Autowired
    private static JavaMailSender javaMailSender;

    public static void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("natmak2011@gmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);

    }
}
