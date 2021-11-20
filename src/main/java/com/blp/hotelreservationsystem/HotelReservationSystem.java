package com.blp.hotelreservationsystem;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hotel Reservation System Program.
 */

public class HotelReservationSystem {

    public static ArrayList<Hotel> list = new ArrayList<Hotel>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        System.out.println("Choice number to do operation");
        System.out.println("1. Add hotel details");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        while (choice > 0) {
            switch (choice) {
                case 1:
                    addHotel();
                    break;
                default:
                    System.out.println("Enter valid number");
            }
            System.out.println("Choice number to do operation");
            System.out.println("1. Add hotel details");
            System.out.println("0. Exit");
            choice = sc.nextInt();
        }
        System.out.println("Program Ended...");
    }

    private static void addHotel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hotel name and rates");
        String name = sc.nextLine();
        int rates = sc.nextInt();
        Hotel hotel = new Hotel(name,rates);
        list.add(hotel);
        System.out.println(hotel.toString());
    }

}

