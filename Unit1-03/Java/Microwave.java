/*
* This program calculates the time user's food needs in the microwave
*
* @author  Michael Zagon
* @version 1.0
* @since   2024-02-24
*
*/

import java.util.Scanner;

/**
 * Program.
 */
final class Microwave {

    /**
    * This is the subs base time.
    */
    public static final double SUBTIME = 60;
    /**
     * This is the pizzas base time.
     */
    public static final double PIZZATIME = 45;
    /**
     * This is the soups base time.
     */
    public static final double SOUPTIME = 105;
    /**
     * This is the multiplier for two items.
     */
    public static final double TWOFOOD = 1.5;
    /**
     * This is the multiplier for three items.
     */
    public static final double THREEFOOD = 2;
    /**
     * This is the variable for a sub.
     */
    public static final String SUB = "sub";
    /**
     * This is the variable for pizza.
     */
    public static final String PIZZA = "pizza";
    /**
     * This is the variable for soup.
     */
    public static final String SOUP = "soup";
    /**
     * This is the variable for one.
     */
    public static final String ONE = "one";
    /**
     * This is the variable for two.
     */
    public static final String TWO = "two";
    /**
     * This is the variable for three.
     */
    public static final String THREE = "three";
    /**
     * This is the variable for 60 seconds.
     */
    public static final double SIXTY = 60;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if called
    */

    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        double time = 0;
        double minutes = 0;
        double seconds = 0;

        // Input
        final Scanner firstInput = new Scanner(System.in);
        final Scanner numberInput = new Scanner(System.in);
        System.out.print("Enter your choice, sub, pizza, or soup: ");
        final String userInput = firstInput.nextLine();
        System.out.print("Enter the amount: ");
        final String amountNumber = numberInput.nextLine();

        // try and catch for invalid or valid inputs.
        if (userInput.equals(SUB) || userInput.equals(PIZZA)
            || userInput.equals(SOUP)) {

            if (userInput.equals(SUB)) {
                time = SUBTIME;
            } else if (userInput.equals(PIZZA)) {
                time = PIZZATIME;
            } else if (userInput.equals(SOUP)) {
                time = SOUPTIME;
            }

            // Process
            if (amountNumber.equals(ONE) || amountNumber.equals(TWO)
                || amountNumber.equals(THREE)) {
                if (amountNumber.equals(TWO)) {
                    time = time * TWOFOOD;
                } else if (amountNumber.equals(THREE)) {
                    time = time * THREEFOOD;
                }
                seconds = time / SIXTY;
                minutes = Math.floor(seconds);
                seconds = (seconds - minutes) * SIXTY;
                System.out.println("The " + userInput + " will be done in "
                    + minutes + " minutes " + seconds + " seconds!");

            // catches invalid number input
            } else {
                System.out.println("Invalid Number!");
            }
            // catches invalid word input
        } else {
            System.out.println("Invalid Food!");
        }
        System.out.println("\nDone!");
    }
}
