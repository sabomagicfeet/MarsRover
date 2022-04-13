import java.util.Arrays;

public class Plateau {
    private int maxX;
    private int maxY;

    private boolean[][] grid;

    public Plateau(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;

        // Initialize the grid with false automatically
        grid = new boolean[maxX + 1][maxY + 1];
    }

    public String status() {
        return "This Mars has " + this.maxX + " x " + this.maxY + " Plateaus";
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public boolean[][] getGrid() {
        return grid;
    }
}
