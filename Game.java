public class Game {

    /**
     * Plays multiple rounds of the game and determines the final winner between the user and the computer.
     * Tracks the number of wins for each player and the number of ties, and displays the final result.
     */
    public void checkWinner() {

        Choice ch = new Choice(); // Create an instance of Choice to handle user and computer choices
        int rounds = ch.Rounds(); // Get the number of rounds the user wants to play
        int ties = 0; // Initialize the count for ties
        int userWins = 0; // Initialize the count for user wins
        int computerWins = 0; // Initialize the count for computer wins

        // Loop through each round
        for (int i = 0; i < rounds; i++) {

            String userInput = ch.userChoice(); // Get the user's choice
            String computerInput = ch.computerChoice(); // Get the computer's choice

            // Check for a tie
            if (userInput.equals(computerInput)) {
                ties++;

            // Check for scenarios where the user wins
            } else if (userInput.equals("Rock") && computerInput.equals("Scissors")) {
                userWins++;
            } else if (userInput.equals("Scissors") && computerInput.equals("Paper")) {
                userWins++;
            } else if (userInput.equals("Paper") && computerInput.equals("Rock")) {
                userWins++;

            // If none of the above, the computer wins
            } else {
                computerWins++;
            }
        }

        // Display the final result
        System.out.println("\nFinal Result:");
        System.out.println("User Won: " + userWins + " rounds out of " + rounds + " rounds");
        System.out.println("Computer Won: " + computerWins + " rounds out of " + rounds + " rounds");

        // Determine and announce the final winner
        if (userWins > computerWins) {
            System.out.println("User is the Final WINNER!!");
        } else if (computerWins > userWins) {
            System.out.println("Computer is the Final WINNER!!");
        } else {
            System.out.println("It's a TIE!!");
        }
    }
}
