package com.example.sevimozsoy.logoticket.Client;

import com.example.sevimozsoy.logoticket.Dto.TicketDto;
import com.example.sevimozsoy.logoticket.Model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "LogoTicket-payment",url = "${payment.url}")
public interface PaymentClient {

    @PostMapping(value = "/payment")
    TicketDto createPayment(@RequestBody User requestUser);
}
