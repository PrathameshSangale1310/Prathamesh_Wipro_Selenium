package Assignment6;

import java.util.Scanner;

enum Direction {
    NORTH, SOUTH, EAST, WEST
}

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter direction (NORTH, SOUTH, EAST, WEST): ");
        String input = sc.nextLine().toUpperCase();

        try {
            Direction dir = Direction.valueOf(input);

            switch (dir) {
                case NORTH:
                    System.out.println("Move north");
                    break;
                case SOUTH:
                    System.out.println("Move south");
                    break;
                case EAST:
                    System.out.println("Move east");
                    break;
                case WEST:
                    System.out.println("Move west");
                    break;
                default:
                	System.out.println("Invalid Input");
            }

        } catch (IllegalArgumentException e) {
 
            System.out.println("Invalid direction! Please enter NORTH, SOUTH, EAST, or WEST.");
        }

        sc.close();

	}

}
