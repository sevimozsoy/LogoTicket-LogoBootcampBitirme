package com.example.logoticketadminpanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LogoTicketAdminPanelApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogoTicketAdminPanelApplication.class, args);
    }

}
