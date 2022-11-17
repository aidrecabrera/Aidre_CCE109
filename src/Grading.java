import java.util.ArrayList;
import java.util.Scanner;

public class Grading {
    static USER_INTERFACE UM_UI = new USER_INTERFACE();
    public static void main(String[] args) {
        UM_UI.MAIN_UI();
    }
}
class USER_INTERFACE {
    static FORMULA_COMPUTATION B15_FUNCTION = new FORMULA_COMPUTATION();
    static Scanner UI_SCANNER = new Scanner(System.in);
    void MAIN_UI() {
        ArrayList<Integer> DATABASE_SCIENCE = new ArrayList<>();
        ArrayList<Integer> DATABASE_ENGLISH = new ArrayList<>();
        ArrayList<Integer> DATABASE_FILIPINO = new ArrayList<>();
        ArrayList<Double> DATABASE_GRADES = new ArrayList<>();

        System.out.println("-------------- UM GRADING SYSTEM --------------\n");

        System.out.print("Initial Score in Science: ");
        DATABASE_SCIENCE.add(UI_SCANNER.nextInt());
        System.out.print("Highest Possible Score in Science: ");
        DATABASE_SCIENCE.add(UI_SCANNER.nextInt());
        System.out.println();
        System.out.print("Initial Score in English: ");
        DATABASE_ENGLISH.add(UI_SCANNER.nextInt());
        System.out.print("Highest Possible Score in English: ");
        DATABASE_ENGLISH.add(UI_SCANNER.nextInt());
        System.out.println();
        System.out.print("Initial Score in Filipino: ");
        DATABASE_FILIPINO.add(UI_SCANNER.nextInt());
        System.out.print("Highest Possible Score in Filipino: ");
        DATABASE_FILIPINO.add(UI_SCANNER.nextInt());

        System.out.println("-----------------------------------------------\n");

        System.out.println("-------------- COMPUTED GRADES --------------");
        DATABASE_GRADES.add(B15_FUNCTION.BASE_15(DATABASE_SCIENCE.get(0), DATABASE_SCIENCE.get(1)));
        System.out.printf("Science: %.2f\n", DATABASE_GRADES.get(DATABASE_GRADES.size()-1));
        DATABASE_GRADES.add(B15_FUNCTION.BASE_15(DATABASE_ENGLISH.get(0), DATABASE_ENGLISH.get(1)));
        System.out.printf("English: %.2f\n", DATABASE_GRADES.get(DATABASE_GRADES.size()-1));
        DATABASE_GRADES.add(B15_FUNCTION.BASE_15(DATABASE_FILIPINO.get(0), DATABASE_FILIPINO.get(1)));
        System.out.printf("Filipino: %.2f\n", DATABASE_GRADES.get(DATABASE_GRADES.size()-1));
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("-------------- PROCESSED GRADES --------------");
        B15_FUNCTION.SUBJECT_PROCESS(0, DATABASE_GRADES.get(0));
        B15_FUNCTION.SUBJECT_PROCESS(1, DATABASE_GRADES.get(1));
        B15_FUNCTION.SUBJECT_PROCESS(2, DATABASE_GRADES.get(2));
        System.out.println("----------------------------------------------");
    }
}
class FORMULA_COMPUTATION {
    public double BASE_15(double RAW, double TOTAL) {
        double RESULT = (RAW / TOTAL) * 85 + 15;
        return RESULT;
    }
    void SUBJECT_PROCESS(int SUB_CODE, double SUB_GRADE) {
        switch (SUB_CODE) {
            case 0:
                GRADE_DETERMINER(SUB_GRADE, "Science");
                break;
            case 1:
                GRADE_DETERMINER(SUB_GRADE, "English");
                break;
            case 2:
                GRADE_DETERMINER(SUB_GRADE, "Filipino");
                break;
        }
    }
    void GRADE_DETERMINER(double GRADE, String SUBJECT) {
        if (GRADE > 75 ) {
            System.out.println("You have passed the subject: " + SUBJECT);
        } else {
            System.out.println("You have failed the subject: " + SUBJECT);
        }
    }
}
