public class Game {
    public String checkWinner() {

        Choice ch = new Choice();
        String userInput = ch.userChoice();
        String computerInput = ch.computerChoice();
        String result;
        
        if (userInput.equals(computerInput)) {
            result = "It is a Tie";
        } else if (userInput.equals("Rock") && computerInput.equals("Scissors")) {
            result = "User wins! Rock beats Scissors.";
        } else if (userInput.equals("Scissors") && computerInput.equals("Paper")) {
            result = "User wins! Scissors beats Paper.";
        } else if (userInput.equals("Paper") && computerInput.equals("Rock")) {
            result = "User wins! Paper beats Rock.";
        } else {
            result = "Computer wins!";

        }
        return result;
    }
}
