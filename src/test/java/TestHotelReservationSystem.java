import com.blp.hotelreservationsystem.Hotel;
import com.blp.hotelreservationsystem.HotelReservationSystem;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestHotelReservationSystem {
    @Test
    public void check_Added_Hotels() {
        Hotel hotel1 = new Hotel("Lakeewood", 110, 90);
        Hotel hotel2 = new Hotel("Bridgewood", 160, 60);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150);
        Hotel[] hotelList = { hotel1, hotel2, hotel3 };
        List<Hotel> hotels = Arrays.asList(hotelList);
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        hotelReservation.add(hotel1);
        hotelReservation.add(hotel2);
        hotelReservation.add(hotel3);
        List<Hotel> result = hotelReservation.getHotelList();
       Assert.assertEquals(hotels, result);
    }

}
