package experiment;
import java.util.ArrayList;
import java.util.Scanner;

class UMFUNCTION_LIBRARY {
    Scanner USER_SCANNER = new Scanner(System.in);
    public double initialGrade, totalScore, gradeComputed;
    public int examStage;
    public double firstExam, secondExam, thirdExam, finalExam;
    double finalGrade, LabExercise, LabAssign, LabField;
    double LECExamWeight, LECClassWeight;
    ArrayList<String> LABExam = new ArrayList<>();
    ArrayList<String> LABQuiz = new ArrayList<>();
    ArrayList<String> LABWork = new ArrayList<>();
    double LEC_WEIGHT, LAB_WEIGHT;
    ArrayList<String> TEMPORARY_CONTAINER = new ArrayList<>();

    void BASE_15() {
        gradeComputed = ((initialGrade / totalScore) * 85) + 15;
        if (gradeComputed > 75) {
            System.out.println("You have passed the exam: " + gradeComputed);
        }
        else {
            System.out.println("You have failed the " + examStage + "exam: " + gradeComputed);
        }
    }

    public ArrayList<Double> assignment = new ArrayList<>();
    private ArrayList<Double> quizzes = new ArrayList<>();
    private ArrayList<Double> oral = new ArrayList<>();
    private ArrayList<Double> research = new ArrayList<>();
    double assignmentTotal = 0;
    double quizzesTotal = 0;
    double oralTotal = 0;
    double researchTotal = 0;

    public void setAssignment(double assignmentScore) {
        BASE_15();
        assignmentScore = initialGrade;
        this.assignment.add(assignmentScore);
    }

    public ArrayList<Double> getAssignment() {
        System.out.println(assignment);
        return assignment;
    }

    public void setAssignmentTotal() {
        for(int i = 0; i <= assignment.size()-1; i++) {
            assignmentTotal += assignment.get(i);
        }
    }

    public void setQuizzes(double quizzesScore) {
        BASE_15();
        quizzesScore = initialGrade;
        this.quizzes.add(quizzesScore);
    }

    public ArrayList<Double> getQuizzes() {
        System.out.println(quizzes);
        return quizzes;
    }

    public void setQuizzesTotal() {
        for(int i = 0; i <= quizzes.size()-1; i++) {
            quizzesTotal += quizzes.get(i);
        }
    }

    public void setOral(double oralScore) {
        BASE_15();
        oralScore = initialGrade;
        this.oral.add(oralScore);
    }

    public ArrayList<Double> getOral() {
        System.out.println(oral);
        return oral;
    }

    public void setOralTotal() {
        for(int i = 0; i <= oral.size()-1; i++) {
            oralTotal += oral.get(i);
        }
    }

    public void setResearch(double researchScore) {
        BASE_15();
        researchScore = initialGrade;
        this.research.add(researchScore);
    }

    public ArrayList<Double> getResearch() {
        System.out.println(research);
        return research;
    }

    public void setResearchTotal() {
        for(int i = 0; i <= research.size()-1; i++) {
            researchTotal += research.get(i);
        }
    }

    void GRADE_COMPUTATION() {
        // LECTURE
        LECExamWeight = ((firstExam * 0.10) + (secondExam * 0.10) + (thirdExam * 0.10) + (finalExam * 0.40));
        LECClassWeight = (assignmentTotal * 0.05) + (quizzesTotal * 0.10) + (oralTotal * 0.10) + (researchTotal * 0.15);
        // Finalization
        LEC_WEIGHT = ((LECExamWeight * 0.60) + (LECClassWeight * 0.40)) * 0.40;

//        // LABORATORY
//        LABExam = ((firstExam * 0.10) + (secondExam * 0.10) + (thirdExam * 0.10) + (finalExam * 0.40));
//        LABQuiz = (assignment * 0.05) + (quizzes * 0.10) + (oral * 0.10) + (research * 0.15);
//        LABWork = (LabExercise + LabAssign + LabField);
//        LAB_WEIGHT = (LABExam * 0.50) + (LABQuiz * 0.10) + (LABWork * 0.40);

        // OVERALL COMPUTATION
        finalGrade = LEC_WEIGHT + LAB_WEIGHT;
    }
}