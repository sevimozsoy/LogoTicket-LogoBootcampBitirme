package com.example.logoticketpayment.Dto;

import com.example.logoticketpayment.Model.Ticket;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class VoyageDto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String departure;
    private String arrival;
    private LocalDate date;
    private String price;
    private Boolean isActive;
    private TransportType transportType;
    private List<Ticket> boughtTickets;

    public VoyageDto(Long id, String departure, String arrival, LocalDate date, String price, Boolean isActive, TransportType transportType) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.date = date;
        this.price = price;
        this.isActive = isActive;
        this.transportType = transportType;
    }

    public VoyageDto() {

    }


    public List<Ticket> getBoughtTickets() {
        return boughtTickets;
    }

    public void setBoughtTickets(List<Ticket> boughtTickets) {
        this.boughtTickets = boughtTickets;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
