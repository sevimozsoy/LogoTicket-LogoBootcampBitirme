package com.sevimozsoy.logoticketasyncemailsms.Model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Sms")
public class Sms {


    private String phoneNumber;

    private String content;

    public Sms(String phoneNumber, String content) {

        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    public Sms() {

    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
