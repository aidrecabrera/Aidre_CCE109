package letsCheck;
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        int firstNum, secondNum, sumNum;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        firstNum = userInput.nextInt();
        System.out.print("Enter second number: ");
        secondNum = userInput.nextInt();

        sumNum = firstNum + secondNum;

        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + sumNum);
    }
}
