import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RoverTest {

    private Rover rover;
    private Rover rover1;

    @BeforeEach
    public void setUp() {
        rover = new Rover();
        rover1 = new Rover();
    }
/*
    @Disabled
    @Test
    public void dropDownRoverTest() {
        int x = 0;
        int y = 0;
        char direction = 'N';

        Rover rover = new Rover();

        String expected = "A Rover is dropped at 0, 0, N";
        String actual = rover.dropDownRover(x, y, direction);

        Assertions.assertEquals(expected, actual);
    }

    @Disabled
    @Test
    public void changeDirectionTest() {
        int x = 0;
        int y = 0;
        char direction = 'N';

        Rover rover = new Rover();

        String expected = "A Rover is at 0, 0 and facing E";
        rover.dropDownRover(x, y, direction);
        rover.changeDirection('R');

        String actual = rover.status();

        Assertions.assertEquals(expected, actual);

    }

    @Disabled
    @Test
    public void moveForwardTest() {
        int x = 0;
        int y = 0;
        char direction = 'N';

        Rover rover = new Rover();

        rover.dropDownRover(x, y, direction);
        rover.changeDirection('R');
        rover.moveForward();

        String expected = "A Rover is at 1, 0 and facing E";
        String actual = rover.status();

        Assertions.assertEquals(expected, actual);
    }

    @Disabled
    @Test
    public void moveForwardAndTurnRightAndMoveForwardAndMoverForwardTest() {
        int x = 0;
        int y = 0;
        char direction = 'N';

        rover.dropDownRover(x, y, direction);
        rover.moveForward(); // 0 1 N
        rover.changeDirection('R'); // 0 1 E
        rover.moveForward(); // 1 1 E
        rover.moveForward(); // 2 1 E

        String expected = "A Rover is at 2, 1 and facing E";
        String actual = rover.status();

        Assertions.assertEquals(expected, actual);
    }

    @Disabled
    @Test
    public void moveTest() {
        rover.dropDownRover(5, 5, 'E');
        rover.move("RMMRMMMRMMMMMLLLMMM"); //5 4 S

        String expected = "A Rover is at 5, 8 and facing E";
        String actual = rover.status();

        Assertions.assertEquals(expected, actual);
    }
*/
    @Test
    public void dropDownRoverTest() {
        rover.dropDownRover("5 5 E");

        String expected = "A Rover is at 5, 5 and facing E";
        String actual = rover.status();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moveTest() {
        rover.dropDownRover("5 5 E");
        rover.move("RMMRMMMRMMMMMLLLMMM");

        String expected = "A Rover is at 5, 8 and facing E";
        String actual = rover.status();

        Assertions.assertEquals(expected, actual);
    }

    /*
    @Test
    public void makePlateausOnMars() {
        String userInput = "5 5";
        String[] userInputArray = userInput.split(" ");

        int maxX = Integer.parseInt(userInputArray[0]); // 5
        int maxY = Integer.parseInt(userInputArray[1]); // 5

        Plateau[][] plateaus = new Plateau[maxX][maxY];

        for(int i = 0; i < maxX; i++) {
            for(int j = 0; j < maxY; j++) {
                Location location = new Location(i, j);
                Plateau plateau = new Plateau(location, false);
                plateaus[i][j] = plateau;
            }
        }
        Mars mars = new Mars(maxX, maxY, plateaus);

        String expected = "This Mars has 5 x 5 Plateaus";
        String actual = mars.status();
    }
     */
    /*
    @Test
    public void makePlateauOnMars() {
        String userInput = "5 5";
        String[] userInputArray = userInput.split(" ");

        int maxX = Integer.parseInt(userInputArray[0]); // 5
        int maxY = Integer.parseInt(userInputArray[1]); // 5

        Location[][] locations = new Location[maxX][maxY];

        Plateau plateau = new Plateau(maxX, maxY);

        String expected = "This Mars has 5 x 5 Plateaus";
        String actual = plateau.status();
    }

     */

    @Test
    public void makePlateauOnMars() {
        String userInput = "5 5";
        String[] userInputArray = userInput.split(" ");

        int maxX = Integer.parseInt(userInputArray[0]); // 5
        int maxY = Integer.parseInt(userInputArray[1]); // 5

        Plateau plateau = new Plateau(maxX, maxY);

        String expected = "This Mars has 5 x 5 Plateaus";
        String actual = plateau.status();
    }

    @Test
    public void dropTwoRoversTest() {
        rover.dropDownRover("3 3 E");
        rover1.dropDownRover("0 0 N");

        String expected = "A Rover is at 3, 3 and facing E";
        String actual = rover.status();

        String expected1 = "A Rover is at 0, 0 and facing N";
        String actual1 = rover1.status();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
    }
}
