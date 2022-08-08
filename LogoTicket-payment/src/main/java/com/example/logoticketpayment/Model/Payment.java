package com.example.logoticketpayment.Model;

import com.example.logoticketpayment.Model.Enums.PaymentType;

import java.time.LocalDate;

public class Payment {
    String price;
    PaymentType paymentMethod;
    LocalDate paymentDate;

    public Payment(String price, PaymentType paymentMethod, LocalDate paymentDate) {
        this.price = price;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public Payment() {

    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public PaymentType getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentType paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
