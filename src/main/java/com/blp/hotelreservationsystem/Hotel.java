package com.blp.hotelreservationsystem;

public class Hotel {

    private String hotelName = null;
    private int weekDayRate = 0;
    private int weekEndRate = 0;

    public Hotel(String name, int weekDayRates, int weekEndRates) {
        this.hotelName = name;
        this.weekDayRate = weekDayRates;
        this.weekEndRate = weekEndRates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }

    public int getWeekEndRate() {
        return weekEndRate;
    }

    public void setWeekEndRate(int weekEndRate) {
        this.weekEndRate = weekEndRate;
    }
}
