package java_module.java_basics.question;

import java.util.concurrent.ThreadLocalRandom;

public class NumberGuessingGameSimplified {
    /*

        Write a number guessing game where the player has to guess a number from 1 to 100.

        This is a simplified version of the game. The user is given one attempt only.

        In the beginning of the game:
           Display the prompt "Guess a number (1 to 100): "
           Then take a guess from the player.

        If the user got the right number:
           Display "Congratulations! You've got it!"
           Then exit the game.

        If the guess is smaller than the answer:
           Display "Your guess is too small!"
           Then display the correct answer and "Better luck next time!"
           Then exit the game.

        If the guess is greater than the answer:
           Display "Your guess is too large!"
           Then display the correct answer and "Better luck next time!"
           Then exit the game.

     */
    public static void main(String[] args) {
        // TODO: Complete this method

        int answer = generateRandomNumber();
    }

    private static int generateRandomNumber() {
        return ThreadLocalRandom.current().nextInt(100) + 1;
    }
}
