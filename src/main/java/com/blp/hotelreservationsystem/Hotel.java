package com.blp.hotelreservationsystem;

public class Hotel {
    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName::'" + hotelName + '\'' +
                ", rate::" + rate +
                '}';
    }

    private String hotelName = null;
    private int rate = 0;

    public Hotel(String name, int rates) {
        this.hotelName = name;
        this.rate = rates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
