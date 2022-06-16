public enum RoomType {


    SINGLE(1),
    DOUBLE(2),
    SPAGNANA(20000),
    FAMILY(5);



    public final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
