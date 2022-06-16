import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;
    Guest guest2;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(200, "Great Hall");
        guest = new Guest("Bob");
        guest2 = new Guest("Sally");
    }

    @Test
    public void hasRoomTypeCapacity() {
        assertEquals(200, conferenceRoom.getCapacityRoom());
    }
    @Test
    public void hasRoomRoomName() {
        assertEquals("Great Hall", conferenceRoom.getRoomName());
    }
}
