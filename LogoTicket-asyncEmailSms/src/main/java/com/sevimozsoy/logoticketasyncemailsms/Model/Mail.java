package com.sevimozsoy.logoticketasyncemailsms.Model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Email")
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
