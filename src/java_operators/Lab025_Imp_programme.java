package java_operators;

public class Lab025_Imp_programme {
//    Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//    A: 90-100
//    B: 80-89
//    C: 70-79
//    D: 60-69
//    F: 0-59
    public static void main(String[] args) {
        int marks =70;
        String score = (marks <= 59) ? "F" : (marks < 70 && marks > 59 ) ? "D" :
                (marks < 80 && marks > 69 ) ? "C" : (marks < 90 && marks > 79 ) ? "B" :
                        (marks <= 100 && marks > 89 ) ? "A" : "Input not valide";
        System.out.println(score);
    }
}
