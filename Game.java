public class Game {
    public void checkWinner() {

        Choice ch = new Choice();
        int rounds = ch.Rounds();
        int ties = 0;
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < rounds; i++) {

            String userInput = ch.userChoice();
            String computerInput = ch.computerChoice();

            if (userInput.equals(computerInput)) {
                ties++;

            } else if (userInput.equals("Rock") && computerInput.equals("Scissors")) {
                userWins++;

            } else if (userInput.equals("Scissors") && computerInput.equals("Paper")) {
                userWins++;

            } else if (userInput.equals("Paper") && computerInput.equals("Rock")) {
                userWins++;
            } else {
                computerWins++;
            }
        }
        System.out.println("\nFinal Result :");
        System.out.println("User Won :" + userWins + " Rounds out of" + rounds + " Rounds");
        System.out.println("Computer Won :" + computerWins + " Rounds out of" + rounds + " Rounds");

        if (userWins > computerWins) {
            System.out.println("User is the Final WINNER!!");
        } else if (computerWins > userWins) {
            System.out.println("Computer is the Final WINNER!!");
        } else
            System.out.println("It's a TIE!!");
    }
}
