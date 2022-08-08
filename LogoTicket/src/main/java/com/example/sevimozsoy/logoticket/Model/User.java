package com.example.sevimozsoy.logoticket.Model;

import com.example.sevimozsoy.logoticket.Dto.VoyagesDto;
import com.example.sevimozsoy.logoticket.Model.Enums.PaymentType;
import com.example.sevimozsoy.logoticket.Model.Enums.UserType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String username;
    @Column
    private String gender;
    @Column
    private String password;
    @Enumerated
    private UserType userType;
    @Enumerated
    private PaymentType paymentType;
    @Transient
    private Sms phoneNumber;
    @Transient
    private Mail mail;
    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id")
    private List<VoyagesDto> voyagesDto = new ArrayList<>();
    public User() {

    }
    public User(Long id, String name, String surname, String username, String gender, String password, UserType userType, Sms phoneNumber, Mail mail, List<VoyagesDto> voyagesDto) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.gender = gender;
        this.password = password;
        this.userType = userType;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.voyagesDto = voyagesDto;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public List<VoyagesDto> getVoyagesDto() {
        return voyagesDto;
    }

    public void setVoyagesDto(List<VoyagesDto> voyagesDto) {
        this.voyagesDto = voyagesDto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Sms getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Sms phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }


    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
