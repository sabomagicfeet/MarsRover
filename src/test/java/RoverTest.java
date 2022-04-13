import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RoverTest {

    private Rover rover;
    private Rover rover1;
    private Plateau plateau;

    @BeforeEach
    public void setUp() {
        plateau = new Plateau(5, 5);
        rover = new Rover(plateau);
        rover1 = new Rover(plateau);
    }

    @Test
    public void dropDownRoverTest() {
        rover.dropDownRover("5 5 E");

        String expected = "A Rover is at 5, 5 and facing E";
        String actual = rover.printStatus();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moveTest() {
        rover.dropDownRover("5 5 E");
        rover.move("RMMRMMMRMMMMMLLLMMM");

        String expected = "A Rover is at 5, 8 and facing E";
        String actual = rover.printStatus();

        Assertions.assertEquals(expected, actual);
    }

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
        String actual = rover.printStatus();

        String expected1 = "A Rover is at 0, 0 and facing N";
        String actual1 = rover1.printStatus();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void moveTwoRoversTest() {
        rover.dropDownRover("5 5 E");
        rover.move("RMMRMMMRMMMMMLLLMMM");

        String expected = "A Rover is at 5, 8 and facing E";
        String actual = rover.printStatus();

        Assertions.assertEquals(expected, actual);

        rover1.dropDownRover("0 0 N");
        rover1.move("MMMRMMMR");

        String expected1 = "A Rover is at 3, 3 and facing S";
        String actual1 = rover1.printStatus();

        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void moveOutsidePlateauTest() {
        rover.dropDownRover("5 5 E");
        rover.moveForward();

        String expected = "This Rover is at 5, 5 and facing E";
        String actual = rover.printStatus();
    }

}
