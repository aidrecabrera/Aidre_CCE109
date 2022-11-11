package LaboratoryAct;

import java.util.Scanner;

public class GainLossCalculator {
    public static void main(String[] args) {
        double costP, sellP, result;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        costP = userInput.nextDouble();
        System.out.print("Enter Sell Price: ");
        sellP = userInput.nextDouble();

        if (costP > sellP) {
            result = costP - sellP;
            System.out.println("Your Loss is Php " + result);
        } else {
            result = sellP - costP;
            System.out.println("Your Gain is Php " + result);
        }
    }
}
