package com.example.logoticketpayment.Service;

import com.example.logoticketpayment.Dao.IUserDao;
import com.example.logoticketpayment.Dto.UserDto;
import com.example.logoticketpayment.Dto.VoyageDto;
import com.example.logoticketpayment.Model.Payment;
import com.example.logoticketpayment.Model.Ticket;
import com.example.logoticketpayment.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;


    public Ticket createPayment(UserDto requestUser) {
        Payment newPayment = new Payment();
        Ticket newTicket = new Ticket();
//        UserDto foundUser = database.findByUsername(requestUser.getUsername());
//        newPayment.setPrice(foundUser.getVoyageDto().get(0).getPrice());
        System.out.println(newPayment.getPrice());
        return newTicket;
    }
}
