package com.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {

    /* hotel reservation system attributes*/
    private String hotelName;
    private  String customerType;
    private int rates;

    public HotelReservation(String hotelName, String customerType, int rates) {
        this.hotelName = hotelName;
        this.customerType = customerType;
        this.rates = rates;
    }

    /*generated getters and setters for the variables to access them outside the class*/
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public String getCustomerType() {
        return customerType;
    }
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public int getRates() {
        return rates;
    }
    public void setRates(int rates) {
        this.rates = rates;
    }

    /*generated to string method*/
    @Override
    public String toString() {
        return "HotelReservation{" + "hotelName='" + hotelName + '\'' + ", customerType='"
                                    + customerType + '\'' +", rates=" + rates +'}';
    }

    /*Method to add hotels*/
    public void addHotel() throws HotelReservationException {

        ArrayList<HotelReservation> hotelList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hotel name:");
        String hotelName = scanner.next();
        System.out.println("Enter customer type:");
        String customerType = scanner.next();
        System.out.println("Enter rate:");
        int rate = scanner.nextInt();

        HotelReservation hotel = new HotelReservation(hotelName,customerType,rate);
        if (hotelList.add(hotel)){
            System.out.println("Hotel added successfully!");
        } else throw new HotelReservationException("Hotel is not added successfully");
    }

    /*Main method*/
    public static void main(String[] args){
        System.out.println("Welcome to the hotel reservation system!");
    }
}
