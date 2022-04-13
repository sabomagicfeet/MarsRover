import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("======== Mars Rover Operation ========");
        System.out.println("======================================");
        System.out.println();
        System.out.println("Enter the Mars Plateau's grid size.");
        System.out.println("ex) 5 5  - which means 5 x 5 grid ");
        String gridSizeUserInput = scanner.nextLine();

        String[] userInputArray = gridSizeUserInput.split(" ");
        int maxX = Integer.parseInt(userInputArray[0]); // 5
        int maxY = Integer.parseInt(userInputArray[1]); // 5

        Plateau plateau = new Plateau(maxX, maxY);
        System.out.println(plateau.status());
        System.out.println();
        System.out.println();


        // First Rover
        System.out.println();
        System.out.println("Enter the first Rover's position : ");
        System.out.println("ex) 1 2 N  - drop at 1, 2 grid and facing North ");
        String dropCommandUserInput = scanner.nextLine();

        Rover rover1 = new Rover(plateau);
        rover1.dropDownRover(dropCommandUserInput);
        System.out.println(rover1.printStatus());
        System.out.println();
        System.out.println("Enter the first Rover's move instruction : ");
        System.out.println("L: turn left , R: turn right , M: move forward by one grid point");
        System.out.println("ex) LMLMLMLMM   ");

        String moveCommandUserInput = scanner.nextLine();
        rover1.move(moveCommandUserInput);
        System.out.println(rover1.printStatus());

        // Second Rover
        System.out.println();
        System.out.println("Enter the second Rover's position : ");
        System.out.println("ex) 3 3 E  - drop at 3, 3 grid and facing EAST ");
        dropCommandUserInput = scanner.nextLine();

        Rover rover2 = new Rover(plateau);
        rover2.dropDownRover(dropCommandUserInput);
        System.out.println(rover2.printStatus());
        System.out.println();
        System.out.println("Enter the second Rover's move instruction : ");
        System.out.println("L: turn left , R: turn right , M: move forward by one grid point");
        System.out.println("ex) MMRMMRMRRM   ");

        moveCommandUserInput = scanner.nextLine();
        rover2.move(moveCommandUserInput);
        System.out.println(rover2.printStatus());

        System.out.println();
        System.out.println();
        System.out.println(rover1.status());
        System.out.println(rover2.status());

    }
}
