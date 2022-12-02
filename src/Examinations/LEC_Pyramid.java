package Examinations;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LEC_Pyramid {
    static Scanner GLOBAL_SCANNER = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int USER_END_SESSION = 0;
        do {
            System.out.println("Enter the Size of Star");
            int PYRAMID_SIZE = 0;
            try {
                PYRAMID_SIZE = GLOBAL_SCANNER.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter Integer values only!");
                System.out.print("Enter the Size of Star again: ");
                System.out.println();
            }
            if (PYRAMID_SIZE < 2) {
                int USER_PROMPT = 0;
                do {
                    System.out.println("Size must not be less than 2.");
                    System.out.println("Enter the size value again: ");
                    PYRAMID_SIZE = GLOBAL_SCANNER.nextInt();
                } while (USER_PROMPT == 0);
            }

            for(int row = 0; row < PYRAMID_SIZE; row++) {
                for(int column = row; column < PYRAMID_SIZE; column++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }

            for(int row = 0; row < PYRAMID_SIZE; row++) {
                for(int column = 0; column < row+1; column++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        } while (USER_END_SESSION == 0);
    }
}
