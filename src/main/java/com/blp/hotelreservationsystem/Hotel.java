package com.blp.hotelreservationsystem;

public class Hotel {

    private String hotelName = null;
    private int regularWeekDayRate = 0;
    private int rewardWeekDayRate = 0;
    private int regularWeekEndRate = 0;
    private int rewardWeekEndRate = 0;
    private int rating = 0;

    public Hotel(String hotelName, int regularWeekDayRate, int rewardWeekDayRate,int regularWeekEndRate,int rewardWeekEndRate,int rating) {
        this.hotelName = hotelName;
        this.regularWeekDayRate = regularWeekDayRate;
        this.rewardWeekDayRate = rewardWeekDayRate;
        this.regularWeekEndRate = regularWeekEndRate;
        this.rewardWeekEndRate = rewardWeekEndRate;
        this.rating = rating;
    }
}
