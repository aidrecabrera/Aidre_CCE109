/*
Instruction:
Ask user for his first_name, last_name, height and weight.
Display the output of his Body Mass Index, which can be calculated by  weight/height*height. (Show your code and the output of the console).

Example Output:
Enter your first_name with your last_name: Jackie Chan
Enter your weight (in kg): 60
Enter your height (in m): 1.8

Expected Output:
Welcome Jackie to the Chan family.  Your weight is 60kg and your height is 1.8m.  You Body Mass index is 18.51

*/
package letsCheck;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {
            int userSession = 1;
            String userFN, userLN;
            float userHeight = 0, userWeight = 0;

            System.out.print("\n");
            System.out.println("-----------------------------------------");
            System.out.println("          University of Mindanao         ");
            System.out.println("           BS Computer Science           ");
            System.out.println("              Let's Analyze              ");
            System.out.println("             by Aidre Cabrera            ");
            System.out.println("             Session: " + userSession + "           ");
            System.out.println("-----------------------------------------");
            System.out.print("\n");

            do {
                System.out.print("\n");
                System.out.print("Enter your First Name: ");
                userFN = userInput.nextLine();
                System.out.print("\n");
                System.out.print("Enter your Last Name: ");
                userLN = userInput.nextLine();
                System.out.print("\n");

                String userFullN = userFN + " " + userLN;

                System.out.println("Hello, " + userFullN + "! Welcome to the BMI Calculator.");
                System.out.print("Enter your weight (in kg): ");
                userWeight = userInput.nextFloat();
                System.out.print("\n");
                System.out.print("Enter your height (in m): ");
                userHeight = userInput.nextFloat();
                System.out.print("\n");

                float calcBMI = userWeight / (userHeight * userHeight);

                System.out.println("-----------------------------------------");
                System.out.print("\n");

                System.out.println("                 Output                  ");
                System.out.println("-----------------------------------------");
                System.out.println("Welcome " + userFN + " to the " + userLN + " family!");
                System.out.println("Your weight is " + userWeight + " kg and your height is " + userHeight + "m");
                System.out.printf("Your estimated Body Mass Index is %.2f", calcBMI);
                System.out.print("\n");
                System.out.println("-----------------------------------------");
                System.out.print("\n");

                System.out.print("1 for Restart and 0 for Exit: ");
                userSession = userInput.nextInt();

            } while (userSession == 1);
        }
    }
}
