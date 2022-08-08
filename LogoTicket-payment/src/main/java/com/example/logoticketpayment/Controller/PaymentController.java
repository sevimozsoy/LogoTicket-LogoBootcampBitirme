package com.example.logoticketpayment.Controller;

import com.example.logoticketpayment.Dto.UserDto;
import com.example.logoticketpayment.Model.Ticket;
import com.example.logoticketpayment.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    private Ticket createPayment(@RequestBody UserDto requestUser){
        return paymentService.createPayment(requestUser);
    }
}
