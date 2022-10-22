package firstLab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String userFN = userInput.nextLine();

        System.out.print("Enter Middle Name: ");
        String userMN = userInput.nextLine();

        System.out.print("Enter Last Name: ");
        String userLN = userInput.nextLine();

        System.out.print("Enter ID Number: ");
        int userID = userInput.nextInt();

        String userMI = String.valueOf(userMN.charAt(0)) + ".";

        System.out.println("Full Name: " + userFN + " " + userMI + " " + userLN);
        System.out.println("ID Number: " + userID);
    }

}
