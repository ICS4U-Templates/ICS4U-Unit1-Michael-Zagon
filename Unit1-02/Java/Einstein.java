import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Calculating energy using e=mc^2
*
* @author  Michael Zagon
* @version 1.0
* @since   2024-02-21
*/

/**
 * User inputs mass of their object and it's energy is calculated in (J).
 */

final class Einstein {

    /**
     * Constants.
     */
    public static final int SPEEDOFLIGHT = 299792458;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException
    * if this is ever called.
    *
    * @throws IllegalStateException if this is ever called
    */
    private Einstein() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */

    public static void main(String[] args) {
        try {
            final Scanner input = new Scanner(System.in);
            System.out.print("Enter the mass of an object in kilograms: ");
            final double mass = input.nextDouble();
            final double energy = mass * Math.pow(SPEEDOFLIGHT, 2);
            System.out.println(mass + "kg of mass would produce "
                            + String.format("%.6e", energy) + "J of energy.");
            input.close();
        } catch (InputMismatchException ex) {
            System.out.println("Invalid Input");
        }

        // Shows program is done
        System.out.println("\nDone.");
    }
}
