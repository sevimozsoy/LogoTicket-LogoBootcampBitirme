package com.example.sevimozsoy.logoticket.Model.Enums;

public enum TransportType {
    BUS(45),
    AIRPLANE(189);

    private final int capacity;

    TransportType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
