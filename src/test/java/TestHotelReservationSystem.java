import com.blp.hotelreservationsystem.Hotel;

import com.blp.hotelreservationsystem.HotelReservationSystem;
import org.junit.Assert;
import org.junit.Test;

public class TestHotelReservationSystem extends HotelReservationSystem {

    @Test
    public void check_Added_Hotels() {
        Hotel hotel1 = new Hotel("lakewood", 110, 80,90,80,3);
        Hotel hotel2 = new Hotel("BridgeWood", 160, 110,60,50,4);
        Hotel hotel3 = new Hotel("RidgeWood", 220, 100,150,40,5);
        Object result = HotelReservationSystem.addHotels(hotel1,hotel2,hotel3);
        Assert.assertEquals(list, result);
    }
}


