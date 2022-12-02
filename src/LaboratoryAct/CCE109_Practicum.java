package LaboratoryAct;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CCE109_Practicum {
    static Scanner GLOBAL_SCANNER = new Scanner(System.in);
    static ArrayList<Integer> Inf_ARRAY = new ArrayList<>();
    static int userProceed = 0;
    static int userSelection = 0;
    static double b;
    static double h;
    public static void main(String[] args) {
        System.out.println("------ JAVA ------");
        System.out.println("Enter 1 to Proceed: ");
        userProceed = GLOBAL_SCANNER.nextInt();
        if (userProceed == 1) {
            menuSelection();
        }
    }

    static void menuSelection() {
        System.out.println(
                """
                Main Menu:
                [1] Calculation
                [2] Loop
                [3] Array
                """);
        System.out.println("Enter here: ");
        userSelection = GLOBAL_SCANNER.nextInt();

        switch (userSelection) {
            case 1 -> {
                System.out.println("Enter Base: ");
                b = GLOBAL_SCANNER.nextInt();
                System.out.println("Enter Height: ");
                h = GLOBAL_SCANNER.nextInt();
                firstSelection();
            }
            case 2 -> {
                System.out.println("Enter Star Size: ");
                secondSelection(GLOBAL_SCANNER.nextInt());
            }
            case 3 -> thirdSelection();
            default -> System.out.println("Error input!");
        }
    }
    static void firstSelection() {
        double area = (b*h)/2;
        System.out.println("Area of Triangle: " + area);
        System.out.println("Thank you for using! :)");
    }
    static void secondSelection(int x) {
        for(int row = 0; row < x; row+=2) {
            for(int column = row; column < x; column++) {
                System.out.print(" * ");
            }
            System.out.println();
         }
        System.out.println("Thank you for using! :)");
    }
    static void thirdSelection() {
        int BREAKER = 0;
        do {
            try {
                System.out.println("Enter value only: ");
                Inf_ARRAY.add(GLOBAL_SCANNER.nextInt());
            } catch (InputMismatchException e) {
                System.out.println(Inf_ARRAY);
                System.out.println("Wrong Input!");
                BREAKER = 1;
            }
        } while (BREAKER == 0);
    }
}
