package ex_06_TernaryOpertor;

public class Task_Exercise003_GradeCalculator {
    public static void main(String[] args) {

        // Grade Calculator
        // Take input from the user to display his grades

        // Different Grades for the user
        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // F: 0-59

        String grade = args[0];
        System.out.println(grade);

        int grade1 = Integer.parseInt(grade);

        String result = (grade1 > 90) ? "A Grade" : (grade1 > 89) ? "B Grade" : (grade1 > 79) ? "C Grade" : (grade1 < 59) ? "F Grade" : "D Grade";
        System.out.println(result);
    }
}
