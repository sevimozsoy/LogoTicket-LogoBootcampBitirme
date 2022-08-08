package com.example.logoticketadminpanel.Dto;

import javax.persistence.*;
import java.util.Date;


public class TicketDto {

    private String arrival;
    private String departure;
    private Date date;
    private String seatNo;

    public TicketDto(String arrival, String departure, Date date, String seatNo) {
        this.arrival = arrival;
        this.departure = departure;
        this.date = date;
        this.seatNo = seatNo;
    }

    public TicketDto() {

    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }
}
