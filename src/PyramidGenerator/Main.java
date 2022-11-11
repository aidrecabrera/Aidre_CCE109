package PyramidGenerator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userSession;
        Library Algorithm = new Library();
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("------------------ Welcome to Pyramid Calculator ------------------");
        do {
            System.out.print("\n");
            System.out.print("Enter Pyramid Size: ");
            Algorithm.number = inputScanner.nextInt();
            System.out.print("\n");

            Algorithm.leftTriangle();
            Algorithm.middlePillar();
            Algorithm.invertedLeftTriangle();

            System.out.print("\n");
            System.out.println("Do you want to run the program again?");
            System.out.print("1 for Yes. 0 for No. \nPlease enter here: ");
            userSession = inputScanner.nextInt();
        } while (userSession == 1);
    }
}
class Library {
    public int number;
    void leftTriangle() {
        for(int i = 1; i <= this.number; ++i) {
            for(int j = 1; j <= this.number; ++j) {
                if (j <= i) {
                    System.out.print(" " + "*" + " ");
                }
            }
            System.out.println();
        }
    }
    void middlePillar() {
        for(int i = 1; i <= this.number+1; ++i) {
            for(int j = 1; j <= this.number+1; ++j) {
                if (j == i) {
                    System.out.print(" " + "*" + " ");
                }
            }
        }
        System.out.println();
    }
    void invertedLeftTriangle() {
        for (int i = 0; i <= this.number; ++i) {
            for (int j = this.number-i; j >= 1; --j) {
                System.out.print(" " + "*" + " ");
            }
            System.out.println();
        }
    }
}
