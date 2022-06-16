import org.junit.Before;
import org.junit.Test;



import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Guest guest;
    Guest guest2;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.SINGLE, 22);
        hotel = new Hotel();
        guest = new Guest("Bob");
        guest2 = new Guest("Sally");
    }


    @Test
    public void canAddNewBedroom() {
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }


    @Test
    public void bedroomHasGuest() {
        hotel.addBedroom(bedroom);
        hotel.checkInGuestToBedroom(guest, bedroom);
        assertEquals(1, bedroom.getNumberOfGuests());
    }
    @Test
    public void bedroomCanRemoveGuest() {
        hotel.addBedroom(bedroom);
        hotel.checkInGuestToBedroom(guest, bedroom);
        hotel.checkInGuestToBedroom(guest, bedroom);
        hotel.checkoutGuestBedroom(guest, bedroom);
        assertEquals(1, bedroom.getNumberOfGuests());
    }
}
