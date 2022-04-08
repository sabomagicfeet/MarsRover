import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoverTest {

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

    @Test
    public void moveForwardAndTurnRightAndMoveForwardAndMoverForwardTest() {
        int x = 0;
        int y = 0;
        char direction = 'N';

        Rover rover = new Rover();

        rover.dropDownRover(x, y, direction);
        rover.moveForward(); // 0 1 N
        rover.changeDirection('R'); // 0 1 E
        rover.moveForward(); // 1 1 E
        rover.moveForward(); // 2 1 E

        String expected = "A Rover is at 2, 1 and facing E";
        String actual = rover.status();

        Assertions.assertEquals(expected, actual);
    }


    // next step
    //// 1. commit add changeDirection
    // 2. refactoring - make direction enum
    // 3. moveForwardTest and moveForward
}
