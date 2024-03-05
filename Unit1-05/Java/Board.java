/*
* This program calculates the dimensions used for a wooden board
*
* @author Michael Zagon
* @version 1.0
* @since 2024-03-01
*/

import java.util.Scanner;

/**
* This is the Board program.
*/
final class Board {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if called
    *
    */
    private Board() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Calculates length of board.
    *
    * @param width of the wood
    * @param height of the wood
    * @return length of board foot needed
    */
    static float checkBoardLength(final float width, final float height) {
        final float boardFoot = 144;
        final float length = boardFoot / (width * height);
        return length;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the width (inch): ");
            final float width = Float.parseFloat(scanner.nextLine());
            System.out.print("Enter the height (inch): ");
            final float height = Float.parseFloat(scanner.nextLine());
            if (width > 0 && height > 0) {
                final float length = checkBoardLength(width, height);
                System.out.println("The wood should be " + length
                                 + " inche(es) long.");
            } else {
                Integer.parseInt(null);
            }
        } catch (NumberFormatException exception) {
            System.out.println("Invalid input.");
        }

        scanner.close();

        System.out.println("\nDone.");
    }
}
