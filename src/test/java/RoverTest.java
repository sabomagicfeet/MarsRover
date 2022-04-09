import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RoverTest {

    private Rover rover;

    @BeforeEach
    public void setUp() {
        rover = new Rover();
    }

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

    @Test
    public void dropDownRoverTestAfterRefactoring() {
        rover.dropDownRover("5 5 E");

        String expected = "A Rover is at 5, 5 and facing E";
        String actual = rover.status();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moveTestAfterRefactoring() {
        rover.dropDownRover("5 5 E");
        rover.move("RMMRMMMRMMMMMLLLMMM");

        String expected = "A Rover is at 5, 8 and facing E";
        String actual = rover.status();

        Assertions.assertEquals(expected, actual);
    }
}
