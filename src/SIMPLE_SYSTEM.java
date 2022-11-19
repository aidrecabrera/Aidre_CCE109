// Authored by Aidre Cabrera

import java.util.Arrays;
import java.util.Scanner;

public class SIMPLE_SYSTEM {
    public static void main(String[] args) {
        Scanner GLOBAL_SCANNER = new Scanner(System.in);
        String SN, SI, SC;
        int COURSE_LOAD;
        System.out.print("Name: ");
        SN = GLOBAL_SCANNER.nextLine();
        System.out.println();
        System.out.print("ID: ");
        SI = GLOBAL_SCANNER.nextLine();
        System.out.println();
        System.out.print("Code: ");
        SC = GLOBAL_SCANNER.nextLine();
        System.out.println();
        System.out.print("Course Load: ");
        COURSE_LOAD = GLOBAL_SCANNER.nextInt();
        System.out.println();
        int[] COURSE_DATABASE = new int[COURSE_LOAD];
        int looper = 0;
        int course_number = looper + 1;
        int sum_GRADE = 0;
        do {
            System.out.print("Course " + course_number + ": ") ;
            COURSE_DATABASE[looper] = GLOBAL_SCANNER.nextInt();
            ++course_number;
            ++looper;
            sum_GRADE += COURSE_DATABASE[looper-1];
        } while (looper < COURSE_LOAD);
        System.out.print("\n[");
        for(int index = 0; index < COURSE_LOAD; index++) {
            if (index != COURSE_DATABASE.length-1) {
                System.out.print(COURSE_DATABASE[index] + ", ");
            } else {
                System.out.print(COURSE_DATABASE[index]);
            }
        }

        System.out.println("]");
        int GENERAL_AVERAGE = sum_GRADE / COURSE_DATABASE.length;
        System.out.println();
        System.out.println("Subject Grade");
        System.out.println("Highest Grade: " + largest(COURSE_DATABASE, COURSE_DATABASE.length));
        System.out.println("Lowest Grade: " + COURSE_DATABASE[0]);
        System.out.println("General Average: " + GENERAL_AVERAGE);
        if (GENERAL_AVERAGE >= 75) {
            System.out.println(SN + " has passed the course!");
        } else {
            System.out.println(SN + " has failed the course!");
        }
    }
        static int largest(int []arr, int n){
            Arrays.sort(arr);
            return arr[n - 1];
        }
}