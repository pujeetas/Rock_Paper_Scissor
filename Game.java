public class Game {
    private GameStats stats = new GameStats();

    /**
     * Plays multiple rounds of the game and determines the final winner between the
     * user and the computer.
     * Tracks the number of wins for each player and the number of ties, and
     * displays the final result.
     */
    public void checkWinner() {

        Choice ch = new Choice(); // Create an instance of Choice to handle user and computer choices
        int rounds = ch.Rounds(); // Get the number of rounds the user wants to play

        // Loop through each round
        for (int i = 0; i < rounds; i++) {

            String userInput = ch.userChoice(); // Get the user's choice
            String computerInput = ch.computerChoice(); // Get the computer's choice

            // Check for a tie
            if (userInput.equals(computerInput)) {
                stats.setTies(stats.getTies() + 1);

                // Check for scenarios where the user wins
            } else if (userInput.equals("Rock") && computerInput.equals("Scissors")) {
                stats.setUserWins(stats.getUserWins()+1);

            } else if (userInput.equals("Scissors") && computerInput.equals("Paper")) {
                stats.setUserWins(stats.getUserWins()+1);
                ;
            } else if (userInput.equals("Paper") && computerInput.equals("Rock")) {
                stats.setUserWins(stats.getUserWins()+1);

                // If none of the above, the computer wins
            } else {
                stats.setComputerWins(stats.getComputerWins()+1);
            }
        }
        displayResult(rounds);
    }

    // Display the final result
    public void displayResult(int rounds) {
        System.out.println("\nFinal Result:");
        System.out.println("User Won: " + stats.getUserWins() + " rounds out of " + rounds + " rounds");
        System.out.println("Computer Won: " + stats.getComputerWins() + " rounds out of " + rounds + " rounds");

        // Determine and announce the final winner
        if (stats.getUserWins() > stats.getComputerWins()) {
            System.out.println("User is the Final WINNER!!");
        } else if (stats.getUserWins() > stats.getUserWins()) {
            System.out.println("Computer is the Final WINNER!!");
        } else {
            System.out.println("It's a TIE!!");
        }
    }
}
