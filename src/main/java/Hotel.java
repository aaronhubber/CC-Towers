import java.util.ArrayList;


public class Hotel {

    private ArrayList<Bedroom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();

    }
    public void checkInGuestToBedroom(Guest guest,Bedroom bedroom){
        bedroom.addGuest(guest);
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedRooms.add(bedroom);
    }

    public int getNumberOfBedrooms() {
        return this.bedRooms.size();
    }

    public void checkoutGuestBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }
}
