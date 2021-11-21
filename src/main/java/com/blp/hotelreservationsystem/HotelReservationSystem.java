package com.blp.hotelreservationsystem;

import java.util.*;

/**
 * Hotel Reservation System Program.
 */

public class HotelReservationSystem {
    public static ArrayList<Hotel> list = new ArrayList<>();

    public static ArrayList<Hotel> addHotels(Hotel hotel1, Hotel hotel2, Hotel hotel3) {
        list.add(hotel1);
        list.add(hotel2);
        list.add(hotel3);
        return list;
    }
}

