public class Plateau {
    private Location location;
    private boolean isOccupied;

    public Plateau(Location location, boolean isOccupied) {
        this.location = location;
        this.isOccupied = isOccupied;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
