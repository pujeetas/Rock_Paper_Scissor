class Main {

    /**
     * Main method to start the Rock-Paper-Scissors game.
     * Creates an instance of the Game class and initiates the checkWinner method,
     * which manages the game rounds and determines the final winner.
     */
    public static void main(String[] args) {

        Game game = new Game(); // Create a Game object
        game.checkWinner(); // Start the game and determine the final winner
    }
}