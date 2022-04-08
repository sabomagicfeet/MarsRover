public class Rover {

    private int x;
    private int y;
    private char[] direction;
    private int cursor;

    public Rover() {
        direction = new char[4];
        direction[0] = 'N';
        direction[1] = 'E';
        direction[2] = 'S';
        direction[3] = 'W';
    }

    public String dropDownRover(int x, int y, char direction) {
        this.x = x;
        this.y = y;

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
        } else if(cursor == 3) {
            cursor = 0;
        }
    }

    public String status() {
        return "A Rover is at " + x + ", " + y + " and facing " + direction[cursor];
    }

    public void moveForward() {
        switch (direction[cursor]) {
            case 'N' :
                y += 1;
                break;
            case 'E' :
                x += 1;
                break;
            case 'S' :
                y -= 1;
                break;
            case 'W' :
                x -= 1;
                break;
        }
    }

}
