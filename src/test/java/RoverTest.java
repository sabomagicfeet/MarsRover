import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    public void dropDownRoverTest() {
        int x = 0;
        int y = 0;
        char direction = 'N';

        Rover rover = new Rover();

        String expected = "A Rover is dropped at 0, 0, Ndfs";
        String actual = rover.dropDownRover(x, y, direction);

        Assertions.assertEquals(expected, actual);
    }
}
