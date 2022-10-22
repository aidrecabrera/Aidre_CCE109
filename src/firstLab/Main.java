package firstLab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userSession = 1;
        do {
            Scanner userInput = new Scanner(System.in);

            System.out.print("\n");
            System.out.println("-----------------------------------------");
            System.out.println("          University of Mindanao         ");
            System.out.println("           BS Computer Science           ");
            System.out.println("             Lab Assignment 1            ");
            System.out.println("             by Aidre Cabrera            ");
            System.out.println("             Session: " + userSession + "           ");
            System.out.println("-----------------------------------------");
            System.out.print("\n");

            System.out.println("                 Input                  ");
            System.out.println("-----------------------------------------");
            System.out.print("Enter First Name: ");
            String userFN = userInput.nextLine();
            System.out.print("Enter Middle Name: ");
            String userMN = userInput.nextLine();
            System.out.print("Enter Last Name: ");
            String userLN = userInput.nextLine();
            System.out.print("Enter ID Number: ");
            int userID = userInput.nextInt();
            System.out.println("-----------------------------------------");
            System.out.print("\n");

            String userMI = userMN.charAt(0) + ".";

            System.out.println("                 Output                  ");
            System.out.println("-----------------------------------------");
            System.out.println("Full Name: " + userFN + " " + userMI + " " + userLN);
            System.out.println("ID Number: " + userID);
            System.out.println("-----------------------------------------");
            System.out.print("\n");

            System.out.println("Want to try again?");
            System.out.println("Type 1 for Yes");
            System.out.println("Type 0 for No");
            System.out.print("\n");

            System.out.print("Kindly enter here: ");
            userSession = userInput.nextInt();

        } while (userSession == 1);

        System.out.print("\n");
        System.out.println("Thank you for using my program! :)");
    }

}
