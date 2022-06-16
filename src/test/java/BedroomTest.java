import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    Guest guest2;

    @Before
    public void before(){
        bedroom = new Bedroom( RoomType.SINGLE, 22);
        guest = new Guest("Bob");
        guest2 = new Guest("Sally");
    }
    @Test
    public void hasRoomTypeCapacity(){
        assertEquals(1,bedroom.getCapacityRoom());
    }
    @Test
    public void hasRoomType(){
        assertEquals(RoomType.SINGLE,bedroom.getRoomType());
    }
    @Test
    public void hasRoomNumber(){
        assertEquals(22,bedroom.getRoomNumber());
    }
    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }
    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest2);
        bedroom.removeGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }


}
