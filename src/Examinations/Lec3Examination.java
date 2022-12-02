package Examinations;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lec3Examination {
    public static void main(String[] args) {
        FUNCTION_PARALLELOGRAM function_parallelogram = new FUNCTION_PARALLELOGRAM();
        FUNCTION_STARGEN function_stargen = new FUNCTION_STARGEN();
        FUNC_HANDLING func_handling = new FUNC_HANDLING();
        Scanner userScanner = new Scanner(System.in);
        int menuSelection = 0;
        int proceedSession = 0;
        System.out.print("ENTER 1 TO PROCEED: ");
        proceedSession = userScanner.nextInt();

        if (proceedSession != 1) {
            System.out.println("Okay, Goodbye!");
            System.exit(1);
        }

        System.out.println(
                """
                 MAIN MENU SELECTION:
                 [1] FORMULA FOR PARALLELOGRAM
                 [2] LOOP
                 [3] ARRAY
                """);
        System.out.print("Enter selection: ");
        menuSelection = userScanner.nextInt();

        switch (menuSelection) {
            case 1:
                System.out.println(
                        """
                        CALCULATOR MENU:             
                        [1] SOLVE AREA          
                        [2] SOLVE HEIGHT                
                        [3] SOLVE BASE
                        """);
                System.out.print("Enter Solving Method: ");
                function_parallelogram.subLoop(userScanner.nextInt());
                break;
            case 2:
                function_stargen.generateStar();
                break;
            case 3:
                try {
                    func_handling.mainFunction();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                System.out.println("Incorrect Input!");
                break;
        }
    }
}

class FUNCTION_PARALLELOGRAM {
    public static Scanner FUNC_SCANNER = new Scanner(System.in);
    public static double AreaInput, base, height;
    static void subLoop(int selection) {
        switch (selection) {
            case 1: case1();
            break;
            case 2: case2();
            break;
            case 3: case3();
            break;
            default:
                System.out.println("Incorrect output");
        }
    }
    static void case1() {
        System.out.println("ENTER HEIGHT OF PARALLELOGRAM");
        height = FUNC_SCANNER.nextInt();
        System.out.println("ENTER BASE OF PARALLELOGRAM");
        base = FUNC_SCANNER.nextInt();

        AreaInput = base * height;

        System.out.println("AREA OF PARALLELOGRAM IS: " + AreaInput);
    }
    static void case2() {
        System.out.println("ENTER AREA OF PARALLELOGRAM");
        AreaInput = FUNC_SCANNER.nextInt();
        System.out.println("ENTER BASE OF PARALLELOGRAM");
        base = FUNC_SCANNER.nextInt();

        height = AreaInput / base;
        System.out.println("HEIGHT OF PARALLELOGRAM IS: " + height);
    }
    static void case3() {
        System.out.println("ENTER AREA OF PARALLELOGRAM");
        AreaInput = FUNC_SCANNER.nextInt();
        System.out.println("ENTER HEIGHT OF PARALLELOGRAM");
        height = FUNC_SCANNER.nextInt();

        base = height / AreaInput;
        System.out.println("BASE OF PARALLELOGRAM IS: " + height);
    }
}

class FUNCTION_STARGEN {
    Scanner FUNC_SCANNER = new Scanner(System.in);
    void generateStar() {
        int generateSession = 1;
        int promptUser = 1;
        do {
            System.out.println("\nENTER SIZE OF STAR: ");
            mainGenerator(FUNC_SCANNER.nextInt());

            System.out.println();
            System.out.println("Do you want to continue?");
            System.out.println("" +
                    "\n1 - Yes" +
                    "\n0 - No\n");
            System.out.print("Enter here: ");
            promptUser = FUNC_SCANNER.nextInt();

            if (promptUser == 1 || promptUser == 1) {
                generateSession = 1;
            } else {
                generateSession = 0;
            }
        } while (generateSession == 1);
    }
    void mainGenerator(int size) {
        for(int row = 0; row < size; row++) {
            for(int column = row; column < size; column++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int row = 1; row <= size; ++row) {
            for(int column = 1; column <= size; ++column) {
                if (column <= row) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
class FUNC_HANDLING {
    Scanner FUNC_SCANNER = new Scanner(System.in);
    void mainFunction() throws IOException {
        ArrayList<Integer> infContainer = new ArrayList<>();
        int BREAKER = 0;
        int incrementer = 0;
        do {
            try {
                System.out.print("Enter Value for Index " + incrementer + ": ");
                infContainer.add(FUNC_SCANNER.nextInt());
                if (infContainer.get(infContainer.size()-1) < 0 ) {
                    infContainer.remove(infContainer.size()-1);
                    System.out.println("Negative Input!");
                    BREAKER = 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                BREAKER = 1;
            }
            incrementer++;
        } while (BREAKER == 0);
        System.out.println("List of entered values = " + infContainer);
    }
}
