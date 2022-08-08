package com.example.logoticketadminpanel.Model;

import com.example.logoticketadminpanel.Dto.TicketDto;
import com.example.logoticketadminpanel.Model.Enums.TransportType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String departure;
    private String arrival;
    private LocalDate date;
    private String price;
    private Boolean isActive;
    private TransportType transportType;


    public Voyage(Long id, String departure, String arrival, LocalDate date, String price, Boolean isActive, TransportType transportType) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.date = date;
        this.price = price;
        this.isActive = isActive;
        this.transportType = transportType;
    }

    public Voyage() {

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
