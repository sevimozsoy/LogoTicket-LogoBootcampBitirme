package com.example.sevimozsoy.logoticket.Model;


public class Mail {


    private String email;

    private String content;

    private String title;



    public Mail(String email) {
        this.email = email;
    }

    public Mail() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
