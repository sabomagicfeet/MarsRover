public class Rover {

//    private Location location;

    private int x;
    private int y;
    private Plateau map;

    private final char[] direction = new char[]{'N', 'E', 'S', 'W'};
    private int cursor;


    public Rover() {
    }

    public void dropDownRover(String dropCommand) {
        String[] commandArray = dropCommand.split(" ");

        this.x = Integer.parseInt(commandArray[0]);
        this.y = Integer.parseInt(commandArray[1]);

        switch (commandArray[2]) {
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

    }


    // To be Deleted after refactoring
    public String dropDownRover(int x, int y, char direction) {
        switch (direction) {
            case 'N' :
                this.cursor = 0;
                break;
            case 'E' :
                this.cursor = 1;
                break;
            case 'S' :
                this.cursor = 2;
                break;
            case 'W' :
                this.cursor = 3;
                break;
        }

        return "A Rover is dropped at " + this.x + ", " + this.y + ", " + this.direction[cursor];
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
        return "A Rover is at " + x + ", " + y + " and facing " + direction[cursor];
    }
    public String status() {
        return x + " " + y + " " + direction[cursor];
    }

    public void moveForward() {
        switch (direction[cursor]) {
            case 'N' :
                y += 1;
//                this.location.setY( this.location.getY() + 1 );
                break;
            case 'E' :
                x += 1;
//                this.location.setX( this.location.getX() + 1 );
                break;
            case 'S' :
                y -= 1;
//                this.location.setY( this.location.getY() - 1 );
                break;
            case 'W' :
                x -= 1;
//                this.location.setX( this.location.getX() - 1 );
                break;
        }
    }

    public void move(String moveCommand) {
        for(int i = 0; i < moveCommand.length(); i++) {
            if( (moveCommand.charAt(i) == 'R') || (moveCommand.charAt(i) == 'L') ) {
                changeDirection(moveCommand.charAt(i));
            } else if (moveCommand.charAt(i) == 'M') {
                moveForward();
            } else {
                System.out.println("Invalid command. Please use only R, L and M for the command.");
            }
        }
    }
}
