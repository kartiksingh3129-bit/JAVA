import java.util.Random;
import java.util.Scanner;

public class game_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Enter your choice (rock/paper/scissors): ");
        String userChoice = sc.nextLine();

        int computerChoice = rn.nextInt(3 ) + 1;
        String computerChoiceString = " ";

        switch (computerChoice) {
            case 1 -> computerChoiceString = "rock";
            case 2 -> computerChoiceString = "paper";
            case 3 -> computerChoiceString = "scissors";
        }

        System.out.println("Computer choose: " + computerChoiceString);

        if (userChoice.equals(computerChoiceString)) {
            System.out.println("It's a tie!");
        }
        else if ((userChoice.equals("rock") && computerChoiceString .equals ("scissors")) ||
                (userChoice.equals("paper") && computerChoiceString .equals ("rock")) ||
                (userChoice.equals("scissors") && computerChoiceString .equals ("paper"))) {

            System.out.println("You win!");
        }

        else {
            System.out.println("Computer wins!");
        }

    }
}

