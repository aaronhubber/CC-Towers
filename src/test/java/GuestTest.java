import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("John");
    }
    @Test
    public void hasName(){
        assertEquals("John", guest.getName());
    }
    @Test
    public void canChangeName(){
        guest.setName("Blobby");
        assertEquals("Blobby", guest.getName());
    }

}
