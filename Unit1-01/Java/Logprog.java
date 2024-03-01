/*
*This shows how much logs of each type can fit on a truck
*
* @author  Michael Zagon
* @version 1.0
* @since   2024-02-19
*/

import java.util.Scanner;

/**
 * Max weight per is in kg/m and max weight is in kg.
*/
final class Logprog {
    /**
     * Weight of log per m in kg.
    */
    static final double WEIGHTPERLOG = 20;
    /**
     * Max weight that truck can carry in kg.
    */
    static final double MAXWEIGHT = 1100;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException when called
    *
    */
    private Logprog() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Get inputs
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the length of logs (m) (0.25, 0.5, or 1): ");
        // Calculations
        final float lengthol = scanner.nextFloat();
        // Output
        System.out.println("The truck can carry this many logs: "
            + MAXWEIGHT / (WEIGHTPERLOG * lengthol));

        System.out.println("\nDone.");
    }

}
