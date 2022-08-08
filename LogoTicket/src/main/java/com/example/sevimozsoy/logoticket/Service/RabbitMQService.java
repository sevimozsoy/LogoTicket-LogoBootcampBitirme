package com.example.sevimozsoy.logoticket.Service;


import com.example.sevimozsoy.logoticket.Config.RabbitMQConfig;
import com.example.sevimozsoy.logoticket.Model.Mail;
import com.example.sevimozsoy.logoticket.Model.Sms;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @Autowired
    private RabbitMQConfig config;
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendEmail(Mail email) {
        rabbitTemplate.convertAndSend("LogoTicket.email",email);
    }

    public void sendSms(Sms sms){
        rabbitTemplate.convertAndSend("LogoTicket.sms",sms);
        System.out.println("Sms queue");
    }

}
