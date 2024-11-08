import java.util.Random;
import java.util.Scanner;

public class Choice {

    String choice[] = { "Rock", "Paper", "Scissors" };

    public String userChoice() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String userInput = "";

        while (true) {

            System.out.println("Enter your choice: Rock/Paper/Scissors :");
            userInput = sc.nextLine().trim();

            if(userInput.equalsIgnoreCase("Rock") || userInput.equalsIgnoreCase("Paper") || userInput.equalsIgnoreCase("Scissors")){
                break;
            }
            else
            System.out.println("Enter a valid value");
        }
        userInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1).toLowerCase();
        return userInput;
    }

    public String computerChoice() {
        Random random = new Random();
        int randomIndex = random.nextInt(choice.length); // Generate a random index within the array's bounds
        String randomChoice = choice[randomIndex]; // Get the random choice

        System.out.println("Computer's Choice :" + randomChoice);
        return randomChoice;
    }
    
}
