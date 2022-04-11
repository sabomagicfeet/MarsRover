import java.util.Arrays;

public class Plateau {
    private int maxX;
    private int maxY;

    private boolean[][] grid;

    private Location[][] locations;

    public Plateau(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;

        // Initialize the grid with false automatically
        grid = new boolean[maxX][maxY];
    }

    public String status() {
        System.out.println(grid[0][0]);
        return "This Mars has " + this.maxX + " x " + this.maxY + " Plateaus";
    }

}
