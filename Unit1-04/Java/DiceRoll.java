/*
* This is the dice roll game
*
* @author  Michael Zagon
* @version 1.0
* @since   2024-02-27
*/

import java.util.Scanner;
/**
 * This is a diceroll program.
 */

final class DiceRoll {

    /**
     * This is the max of the random number.
     */
    public static final double MAX = 6;
    /**
     * This is the min of the random number.
     */
    public static final double MIN = 1;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException when called
    *
    */

    private DiceRoll() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        final double randomNumber = (int) (Math.random() * MAX + MIN);
        double counter = 1;

        while (true) {
            try {
                final Scanner firstInput = new Scanner(System.in);
                System.out.print("Guess a number between 1 and 6:  ");
                final double userInput = firstInput.nextDouble();

                if (userInput > MAX || userInput < MIN) {
                    System.out.println("Invalid Input ");
                } else {
                    if (userInput == randomNumber) {
                        System.out.println("You Guessed Correct!");
                        System.out.println("It took you " + counter + " tries");
                        break;
                    } else if (userInput < randomNumber) {
                        System.out.println("You guessed too low.");
                        System.out.println("Guess again. ");
                    } else if (userInput > randomNumber) {
                        System.out.println("You guessed too high.");
                        System.out.println("Guess again.");
                    }
                    counter = counter + 1;
                }
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Invalid Input");
                break;
            }
        }
        System.out.println("\nDone.");
    }
}
