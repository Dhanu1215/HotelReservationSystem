package com.blp.hotelreservationsystem;

import java.util.*;

/**
 * Hotel Reservation System Program.
 */

public class HotelReservationSystem {
    private List<Hotel> hotels;

    public HotelReservationSystem() {
        this.hotels = new ArrayList<Hotel>();
    }

    public void add(Hotel hotel) {
        this.hotels.add(hotel);
    }

    public List<Hotel> getHotelList() {
        return this.hotels;
    }
}

