import java.util.Random;
import java.util.Scanner;

public class Choice {

    String choice[] = { "Rock", "Paper", "Scissors" };
    Scanner sc = new Scanner(System.in);

    /**
     * Prompts the user to enter the number of rounds they want to play.
     * Reads and returns the user input as an integer.
     *
     * @return the number of rounds as an integer.
     */
    public int Rounds() {
        int round = 0;

        System.out.println("Enter Number of Rounds you want.");
        round = sc.nextInt();
        sc.nextLine();
        return round;
    }

    /**
     * Prompts the user to enter their choice of "Rock," "Paper," or "Scissors."
     * Ensures that the input is valid, and returns it in a properly formatted way
     * (first letter capitalized, the rest lowercase).
     *
     * @return the user's choice as a String ("Rock," "Paper," or "Scissors").
     */

    public String userChoice() {
        String userInput;

        while (true) {

            System.out.println("Enter your choice: Rock/Paper/Scissors :");
            userInput = sc.nextLine().trim();

            if (userInput.equalsIgnoreCase("Rock") || userInput.equalsIgnoreCase("Paper")
                    || userInput.equalsIgnoreCase("Scissors")) {
                break;
            } else
                System.out.println("Enter a valid value");
        }
        userInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1).toLowerCase();
        return userInput;
    }

    /**
     * Randomly selects and returns the computer's choice from the options
     * "Rock," "Paper," or "Scissors."
     *
     * @return the computer's choice as a String ("Rock," "Paper," or "Scissors").
     */
    public String computerChoice() {
        Random random = new Random();
        int randomIndex = random.nextInt(choice.length); // Generate a random index within the array's bounds
        String randomChoice = choice[randomIndex]; // Get the random choice

        System.out.println("Computer's Choice :" + randomChoice);
        return randomChoice;
    }

}
