import java.util.ArrayList;

public abstract class Room {

    private int capacity;

    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacityRoom() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void addGuest(Guest guest){
        guests.add(guest);
    }

    public void removeGuest(Guest guest){
        guests.remove(guest);
    }
    public ArrayList<Guest> getGuests(){
        return this.guests;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }
}

