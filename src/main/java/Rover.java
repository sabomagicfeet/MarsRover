import java.util.Locale;

public class Rover {

    private int x;
    private int y;
    private Plateau map;
    private final char[] direction = new char[]{'N', 'E', 'S', 'W'};
    private int cursor;

    private static final int INVALID_LOCATION_VALUE = -1;

    public Rover(Plateau map) {
        this.map = map;
    }

    public void dropDownRover(String dropCommand) {
        String[] commandArray = dropCommand.split(" ");

        this.x = Integer.parseInt(commandArray[0]);
        this.y = Integer.parseInt(commandArray[1]);

        switch (commandArray[2].toUpperCase()) {
            case "N" :
                this.cursor = 0;
                break;
            case "E" :
                this.cursor = 1;
                break;
            case "S" :
                this.cursor = 2;
                break;
            case "W" :
                this.cursor = 3;
                break;
        }

        if( x > map.getMaxX()
                || y > map.getMaxY()
                || x < 0
                || y < 0 ) {
            this.x = INVALID_LOCATION_VALUE;
            this.y = INVALID_LOCATION_VALUE;
        }

    }

    public void changeDirection(char turn) {
        if(turn == 'R') {
            cursor += 1;
        } else if (turn == 'L') {
            cursor -= 1;
        }

        if(cursor == -1){
            cursor = 3;
        } else if(cursor == 4) {
            cursor = 0;
        }
    }

    public String printStatus() {
        if(this.x <= INVALID_LOCATION_VALUE || this.y <= INVALID_LOCATION_VALUE) {
            return "This Rover is outside of Plateau. You lost the Rover which is £1,000,000,000";
        }
        return "This Rover is at " + x + ", " + y + " and facing " + direction[cursor];
    }
    public String status() {
        if(this.x <= INVALID_LOCATION_VALUE || this.y <= INVALID_LOCATION_VALUE) {
            return "This Rover is outside of Plateau. You lost the Rover which is £1,000,000,000";
        }
        return x + " " + y + " " + direction[cursor];
    }

    public void moveForward() {
        switch (direction[cursor]) {
            case 'N' :
                if(y == map.getMaxY()) {
                    System.out.println("This Rover can't move forward anymore.");
                } else {
                    y += 1;
                }
                break;

            case 'E' :
                if(x == map.getMaxX()) {
                    System.out.println("This Rover can't move forward anymore.");
                } else {
                    x += 1;
                }
                break;

            case 'S' :
                if(y == 0) {
                    System.out.println("This Rover can't move forward anymore.");
                } else {
                    y -= 1;
                }
                break;

            case 'W' :
                if(x == 0) {
                    System.out.println("This Rover can't move forward anymore.");
                } else {
                    x -= 1;
                }
                break;
        }
    }

    public void move(String moveCommand) {
        String upperCaseMoveCommand = moveCommand.toUpperCase();
        for(int i = 0; i < upperCaseMoveCommand.length(); i++) {
            if( (upperCaseMoveCommand.charAt(i) == 'R') || (upperCaseMoveCommand.charAt(i) == 'L') ) {
                changeDirection(upperCaseMoveCommand.charAt(i));
            } else if (upperCaseMoveCommand.charAt(i) == 'M') {
                moveForward();
            } else {
                System.out.println("Invalid command. Please use only R, L and M for the command.");
            }
        }
    }
}
