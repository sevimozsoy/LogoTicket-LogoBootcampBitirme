package com.example.sevimozsoy.logoticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LogoTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogoTicketApplication.class, args);
    }

}
