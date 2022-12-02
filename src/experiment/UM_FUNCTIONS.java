package experiment;
import static experiment.UM_SYSTEM_UI.GLOBAL_SCANNER;
public class UM_FUNCTIONS extends UMFUNCTION_LIBRARY {
    UMFUNCTION_LIBRARY libraryFunctions = new UMFUNCTION_LIBRARY();
    int LECTURE_SESSION;
    int dLec_Session = 1;
    void LECTURE_MENU() {
        System.out.println(
                "Lecture Dashboard" +
                "\n 1. Assigment" +
                "\n 2. Quizzes" +
                "\n 3. Oral Recitation" +
                "\n 4. Research");

        System.out.print("Enter Here: ");
        LECTURE_SESSION = GLOBAL_SCANNER.nextInt();
        switch (LECTURE_SESSION) {
            case 1:
                dLec_Assignment();
                break;
            case 2:
                dLec_Quizzes();
                break;
            case 3:
                dLec_Oral();
                break;
            case 4:
                dLec_Research();
                break;
        }
    }
    void STUDENT_INPUT() {
        System.out.print("Enter Your Score:");
        initialGrade = USER_SCANNER.nextDouble();
        System.out.println();
        System.out.print("Enter Highest Score:");
        totalScore = USER_SCANNER.nextDouble();
    }
    void dLec_Assignment() {
        do {
            System.out.println("SCORE DATABASE");
            STUDENT_INPUT();
            libraryFunctions.setAssignment(libraryFunctions.initialGrade);
            System.out.println(
                    "\n1. Continue" +
                    "\n0. Back");
        } while (dLec_Session == 1);
    }
    private void dLec_Quizzes() {
        do {
            System.out.println("SCORE DATABASE");
            STUDENT_INPUT();
            libraryFunctions.setQuizzes(initialGrade);
            System.out.println(
                    "\n1. Continue" +
                    "\n0. Back");
        } while (dLec_Session == 1);
    }
    private void dLec_Oral() {
        do {
            System.out.println("SCORE DATABASE");
            STUDENT_INPUT();
            libraryFunctions.setOral(initialGrade);
            System.out.println(
                    "\n1. Continue" +
                    "\n0. Back");
        } while (dLec_Session == 1);
    }
    private void dLec_Research() {
        do {
            System.out.println("SCORE DATABASE");
            STUDENT_INPUT();
            libraryFunctions.setResearch(initialGrade);
            System.out.println(
                    "\n1. Continue" +
                    "\n0. Back");
        } while (dLec_Session == 1);
    }
}

