import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean again = true ;

        while (again) {
            //Asking for user input
            System.out.println("Pick a number between 1 and 10");
            Scanner scanner = new Scanner(System.in);

            //Holds the players number
            int inputNum = scanner.nextInt();

            //Begin if statement
            if (inputNum < 5) {
                System.out.println("Enjoy the good luck a friend brings you!");
            } else {
                System.out.println("Your shoe selection will make you happy today");
            }
            System.out.println("Would you like to play again? y/n");
            String userInput = input.next();
            if(userInput.equals("n")){
                again = false;
        }
        }


    }
}
