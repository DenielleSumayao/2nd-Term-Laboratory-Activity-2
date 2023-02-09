package Bedroom;

public class Bedroom {
    String type;
    int bedroom_count;
    public Bedroom (String type, int rooms) {
        this.type = type;
        this.bedroom_count = rooms;
    }
    
    public String getType() {
        return this.type;
    }
    public int getRoomCount() {
        return this.bedroom_count;
    }

    public void setType (String type) {
        this.type = type;
    }
    public void setRoom(int count) {
        this.bedroom_count = count;
    }
}
