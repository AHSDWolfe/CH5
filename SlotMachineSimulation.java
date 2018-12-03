/**
 * Denver Wolfe
 * CH5PC21
 * Programming III - AP CS
 * 11/30/18
 */

//Import Scanner and Random
import java.util.Scanner;
import java.util.Random;

public class SlotMachineSimulation {

    public static void main(String[] args) {

        //Create and assign values to variables
        int num1, num2, num3, money, totalEntered = 0, totalWon = 0;
        String stringNum1, stringNum2, stringNum3;
        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")) {
            //Create Scanner and Random objects
            Scanner kb = new Scanner(System.in);
            Random r = new Random();

            //Assign random values to the three numbers
            num1 = r.nextInt(5);
            num2 = r.nextInt(5);
            num3 = r.nextInt(5);

            //Assign values for each number (0-5)
            switch (num1) {
                case 0:
                    stringNum1 = "Cherries";
                    break;
                case 1:
                    stringNum1 = "Oranges";
                    break;
                case 2:
                    stringNum1 = "Plums";
                    break;
                case 3:
                    stringNum1 = "Bells";
                    break;
                case 4:
                    stringNum1 = "Melons";
                    break;
                default:
                    stringNum1 = "Bars";
                    break;
            }
            switch (num2) {
                case 0:
                    stringNum2 = "Cherries";
                    break;
                case 1:
                    stringNum2 = "Oranges";
                    break;
                case 2:
                    stringNum2 = "Plums";
                    break;
                case 3:
                    stringNum2 = "Bells";
                    break;
                case 4:
                    stringNum2 = "Melons";
                    break;
                default:
                    stringNum2 = "Bars";
                    break;
            }
            switch (num3) {
                case 0:
                    stringNum3 = "Cherries";
                    break;
                case 1:
                    stringNum3 = "Oranges";
                    break;
                case 2:
                    stringNum3 = "Plums";
                    break;
                case 3:
                    stringNum3 = "Bells";
                    break;
                case 4:
                    stringNum3 = "Melons";
                    break;
                default:
                    stringNum3 = "Bars";
                    break;
            }

            //Ask how much would like to be bet
            System.out.println("How much money would you like to bet?: ");
            money = kb.nextInt();
            totalEntered += money;

            System.out.println(stringNum1 + " " + stringNum2 + " "
                    + stringNum3);

            //Create if statements for all possible winnings
            if (num1 == num2 && num2 == num3) {
                System.out.println("Congratulations! You win $" + money * 3
                        + "!");
                totalWon += money * 3;
            } else if (num1 == num2 || num2 == num3) {
                System.out.println("Congratulations! You win $" + money * 2
                        + "!");
                totalWon += money * 2;
            } else {
                System.out.println("You win $0!");
            }

            //Ask if would like to play again
            System.out.println("Would you like to play again?");
            answer = kb.next();

            //Validate input
            while (!answer.equalsIgnoreCase("no")
                    && !answer.equalsIgnoreCase("yes")) {
                System.out.println("Input invalid!");
                System.out.println("Would you like to play again?");
                answer = kb.next();
            }

            while (answer.equalsIgnoreCase("no")) {
                System.out.println("\nYou entered $" + totalEntered
                        + "!");
                System.out.println("You won $" + totalWon + "!");
                System.exit(0);
            }
        }
    }
}
