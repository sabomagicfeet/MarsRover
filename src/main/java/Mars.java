public class Mars {
    private int maxX;
    private int maxY;
    private Plateau[][] plateaus;

    public Mars(int maxX, int maxY, Plateau[][] plateaus) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.plateaus = plateaus;
    }

    public String status() {
        return "This Mars has " + this.maxX + " x " + this.maxY + " Plateaus";
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public Plateau[][] getPlateaus() {
        return plateaus;
    }

    public void setPlateaus(Plateau[][] plateaus) {
        this.plateaus = plateaus;
    }
}
