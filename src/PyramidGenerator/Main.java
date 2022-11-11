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
        for(int pyRow = 1; pyRow <= this.number; ++pyRow) {
            for(int pyColumn = 1; pyColumn <= this.number; ++pyColumn) {
                if (pyColumn <= pyRow) {
                    System.out.print(" " + "*" + " ");
                }
            }
            System.out.println();
        }
    }
    void middlePillar() {
        for(int pyRow = 1; pyRow <= this.number+1; ++pyRow) {
            for(int pyColumn = 1; pyColumn <= this.number+1; ++pyColumn) {
                if (pyColumn == pyRow) {
                    System.out.print(" " + "*" + " ");
                }
            }
        }
        System.out.println();
    }
    void invertedLeftTriangle() {
        for (int pyRow = 0; pyRow <= this.number; ++pyRow) {
            for (int pyColumn = this.number-pyRow; pyColumn >= 1; --pyColumn) {
                System.out.print(" " + "*" + " ");
            }
            System.out.println();
        }
    }
}
