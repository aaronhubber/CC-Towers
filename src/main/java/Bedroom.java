import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
    //private ArrayList<Guest> guests;

    public Bedroom(RoomType roomType, int roomNumber) {
        super(roomType.getCapacity());
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

}
