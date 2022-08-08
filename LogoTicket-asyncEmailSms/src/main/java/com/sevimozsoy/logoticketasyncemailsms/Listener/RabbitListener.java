package com.sevimozsoy.logoticketasyncemailsms.Listener;

import com.sevimozsoy.logoticketasyncemailsms.Model.Mail;
import com.sevimozsoy.logoticketasyncemailsms.Model.Sms;
import com.sevimozsoy.logoticketasyncemailsms.Service.DatabaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.support.ListenerExecutionFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitListener {

    @Autowired
    private DatabaseService databaseService;

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "LogoTicket.email")
    public void emailListener(Mail email){

        log.info("email address: {}",email.getEmail());
        databaseService.saveMail(email);


    }
    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "LogoTicket.sms")
    public void smsListener(Sms sms){

        log.info("phone Number: {}",sms.getPhoneNumber());


    }

}
