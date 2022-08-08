package com.example.logoticketpayment.Dto;

import com.example.logoticketpayment.Model.Enums.PaymentType;

import java.util.ArrayList;
import java.util.List;

public class UserDto {


    private String name;

    private String surname;

    private String username;

    private String gender;
    private String password;
    private UserType userType;
    private PaymentType paymentType;
    private List<VoyageDto> voyageDto = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public List<VoyageDto> getVoyageDto() {
        return voyageDto;
    }

    public void setVoyageDto(List<VoyageDto> voyageDto) {
        this.voyageDto = voyageDto;
    }

}
