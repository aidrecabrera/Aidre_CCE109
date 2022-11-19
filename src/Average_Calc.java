import java.util.ArrayList;
import java.util.Scanner;

public class Average_Calc {
    static int STUDENT_SESSION = 1;
    static STUDENT_INPUT student_input = new STUDENT_INPUT();
    static Scanner GLOBAL_SCANNER = new Scanner(System.in);
    static String CURRENT_SN, CURRENT_SI, CURRENT_SC;
    public static void main(String[] args) {
        System.out.println("Student Name: ");
        CURRENT_SN = GLOBAL_SCANNER.nextLine();
        System.out.println("Student ID: ");
        CURRENT_SI = GLOBAL_SCANNER.nextLine();
        System.out.println("Student Code: ");
        CURRENT_SC = GLOBAL_SCANNER.nextLine();
        student_input.SESSION_CONTAINER(CURRENT_SN, CURRENT_SI, CURRENT_SC);
        System.out.println("Course Load: ");
        student_input.SESSION_DATABASE(GLOBAL_SCANNER.nextInt());
    }
}

class STUDENT_INPUT {
    GRADE_FUNCTIONS grade_functions = new GRADE_FUNCTIONS();
    String STUDENT_NAME, STUDENT_ID, STUDENT_CODE;
    ArrayList<Integer> UNPROCESSED_GRADES = new ArrayList<>();
    ArrayList<Integer> PROCESSED_GRADES = new ArrayList<>();
    ArrayList<Integer> STUDENT_LOAD = new ArrayList<>();
    void SESSION_CONTAINER(String SN, String SI, String SC) {
        SN = STUDENT_NAME;
        SI = STUDENT_ID;
        SC = STUDENT_CODE;
        System.out.print("Name: " + SN);
        System.out.println();
        System.out.print("ID: " + SI);
        System.out.println();
        System.out.print("Code: " + SC);
        System.out.println();
        SESSION_COMPUTATION();
    }
    void SESSION_COMPUTATION() {
        PRINT_LOAD();
        grade_functions.FORMULA_COMPUTATION();
        System.out.println("General Course Grade");
        System.out.println("Highest Grade: " + STUDENT_LOAD.get(STUDENT_LOAD.size()));
        System.out.println("Lowest Grade: " + STUDENT_LOAD.get(0));
        System.out.println("Average Grade: " + grade_functions.FORMULA_COMPUTATION());
        grade_functions.PASS_FAIL();
    }
    void SESSION_DATABASE(int load) {
        ArrayList<Integer> LOAD_CONTAINER = new ArrayList<>(load);
        for(int position = 0; position < LOAD_CONTAINER.size()-1; position++) {
            STUDENT_LOAD.add(LOAD_CONTAINER.get(position));
        }
    }
    void PRINT_LOAD() {
        System.out.println(STUDENT_LOAD);
        for(int LOAD_SESSION_INDEX = 0; LOAD_SESSION_INDEX < STUDENT_LOAD.size()-1; LOAD_SESSION_INDEX++) {
            System.out.println("Course " + LOAD_SESSION_INDEX + STUDENT_LOAD.get(LOAD_SESSION_INDEX));
        }
    }
}

class GRADE_FUNCTIONS {
    STUDENT_INPUT student_input = new STUDENT_INPUT();
    int SUM_GRADE, AVERAGE_GRADE;
    int FORMULA_COMPUTATION() {
        for(int IND_GRADE = 0; IND_GRADE < student_input.STUDENT_LOAD.size()-1; IND_GRADE++) {
            SUM_GRADE += student_input.STUDENT_LOAD.get(IND_GRADE);
            AVERAGE_GRADE = SUM_GRADE / student_input.STUDENT_LOAD.size()-1;
        }
        return AVERAGE_GRADE;
    }
    void PASS_FAIL() {
        if (AVERAGE_GRADE > 75 ) {
            System.out.println(student_input.STUDENT_NAME + " has passed the subject");
        } else {
            System.out.println(student_input.STUDENT_NAME + " has failed the subject");
        }
    }
}
