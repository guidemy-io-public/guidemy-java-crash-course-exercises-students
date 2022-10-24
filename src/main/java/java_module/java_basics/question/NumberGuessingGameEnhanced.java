package java_module.java_basics.question;

import java.util.concurrent.ThreadLocalRandom;

public class NumberGuessingGameEnhanced {
    /*

        Write a number guessing game where the player has to guess a number from 1 to 100.

        This time, the user should be allowed to make multiple attempts.

        The maximum number of attempts is defined in the first line of the program.

        In the beginning of the game:
           Display the prompt "Guess a number (1 to 100): "
           Then take a guess from the player.

        If the user got the right number:
           Display "Congratulations! You've got it!"
           Then exit the game.

        If the guess is smaller than the answer:
           Display "Your guess is too small!"
           Then show the number of attempts left.

        If the guess is greater than the answer:
           Display "Your guess is too large!"
           Then show the number of attempts left.

        If there are no attempts left:
           Display the correct answer and the line:
           "You have no more attempts left. Better luck next time!"
           Then exit the game.


        *** Challenge ***
            If the user has entered anything other than an integer from 1 to 100,
            display "Please enter a number from 1 to 100!"
            then prompt the user to guess again.

     */
    public static void main(String[] args) {
        // TODO: Complete this method

        int maxAttempts = 10;
        int answer = generateRandomNumber();
    }

    private static int generateRandomNumber() {
        return ThreadLocalRandom.current().nextInt(100) + 1;
    }
}
