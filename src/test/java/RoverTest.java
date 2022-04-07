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

        String expected = "A Rover is at 0, 0 and facing East";
        rover.dropDownRover(x, y, direction);
        rover.changeDirection('R');

        String actual = rover.status();

        Assertions.assertEquals(expected, actual);

    }
}
