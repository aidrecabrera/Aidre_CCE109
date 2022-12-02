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
        System.out.print("ENTER HEIGHT OF PARALLELOGRAM: ");
        height = Math.abs(FUNC_SCANNER.nextInt());
        System.out.println();
        System.out.print("ENTER BASE OF PARALLELOGRAM: ");
        base = Math.abs(FUNC_SCANNER.nextInt());
        System.out.println();
        AreaInput = base * height;
        System.out.println("AREA OF PARALLELOGRAM IS: " + AreaInput);
    }
    static void case2() {
        System.out.print("ENTER AREA OF PARALLELOGRAM: ");
        AreaInput = Math.abs(FUNC_SCANNER.nextInt());
        System.out.println();
        System.out.print("ENTER BASE OF PARALLELOGRAM: ");
        base = Math.abs(FUNC_SCANNER.nextInt());
        System.out.println();
        height = AreaInput / base;
        System.out.println("HEIGHT OF PARALLELOGRAM IS: " + height);
    }
    static void case3() {
        System.out.print("ENTER AREA OF PARALLELOGRAM: ");
        AreaInput = Math.abs(FUNC_SCANNER.nextInt());
        System.out.println();
        System.out.print("ENTER HEIGHT OF PARALLELOGRAM: ");
        height = Math.abs(FUNC_SCANNER.nextInt());
        System.out.println();
        base = height / AreaInput;
        System.out.println("BASE OF PARALLELOGRAM IS: " + base);
    }
}

class FUNCTION_STARGEN {
    Scanner FUNC_SCANNER = new Scanner(System.in);
    void generateStar() {
        int generateSession = 1;
        int tempContainer;
        int correctInput = 0;
        while (generateSession == 1) {
            try {
                do {
                    System.out.print("\nENTER SIZE OF STAR: ");
                    tempContainer = FUNC_SCANNER.nextInt();
                    System.out.println();
                    if (tempContainer < 0 ) {
                        System.out.println("Negative Input!");
                    } else {
                        correctInput = 1;
                    }

                } while (correctInput == 0);
                mainGenerator(tempContainer);
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
            }

            System.out.println();
            System.out.println("Do you want to continue?");
            System.out.println("" +
                    "\n[Y] - Yes" +
                    "\n[N] - No\n");
            System.out.print("Enter Here: ");
            Boolean booleanPrompt = new Scanner(System.in).nextLine().equalsIgnoreCase("Y")?true:false;
            if (booleanPrompt == false) {
                System.out.println("Goodbye!");
                generateSession = 0;
            }
        }
    }
    void mainGenerator(int size) {
        for(int row = 0; row < size; row+=2) {
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
                    System.out.println("Value not added as it is a negative Input!");
                    incrementer--;
                }
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Invalid Input!");
                BREAKER = 1;
            }
            incrementer++;
        } while (BREAKER == 0);
        System.out.println();
        System.out.println("List of entered valid values = " + infContainer);
    }
}
