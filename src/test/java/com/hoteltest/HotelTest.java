package com.hoteltest;

import com.hotel.HotelReservation;
import com.hotel.HotelReservationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelTest {
    @Test
    void everyTimeWhenNewHotelIsAddedSuccessfully_ShouldReturnTrue() throws HotelReservationException {
        HotelReservation hotelReservation = new HotelReservation("Bridgewood","regular",160);
        hotelReservation.addHotel();
        Assertions.assertEquals(hotelReservation,true);
    }
}
