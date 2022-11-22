package experiment;

import java.util.Scanner;

public class UM_SYSTEM_UI {
    static int STUDENT_INTERFACE;
    static Scanner GLOBAL_SCANNER = new Scanner(System.in);
    static UMFUNCTION_LIBRARY func = new UMFUNCTION_LIBRARY();
    static UM_FUNCTIONS um_functions = new UM_FUNCTIONS();
    public static void main(String[] args) {
        do {
            int MENU_SESSION = 0;
            System.out.println("UM Grading System");
            System.out.println(
                    "\n0. EXIT" +
                    "\n1. LECTURE" +
                    "\n2. LABORATORY");
            System.out.print("ENTER HERE: ");
            MENU_SESSION = GLOBAL_SCANNER.nextInt();
            switch (MENU_SESSION) {
                case 1:
                    um_functions.LECTURE_MENU();
            }
        } while (STUDENT_INTERFACE == 1);
    }
}