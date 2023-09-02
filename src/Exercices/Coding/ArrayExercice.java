package Exercices.Coding;

import java.util.Scanner;

public class ArrayExercice {

    public static void main(String[] args) {
        ArrayExercice exerciceArray = new ArrayExercice();
        exerciceArray.gradeStudents();
    }

    public void gradeStudents() {
        //
        int[] grades = new int[5];
        Scanner scanner = new Scanner(System.in);
        //students[i] are nota gradents[i]

        String[] students = {"Jhon", "Paul", "George", "Ringo", "Max"};

        for (int i = 0; i < students.length; i++) {
            System.out.println("Please grade student " + students[i]);

            do {
                try {

                    grades[i] = scanner.nextInt();

                    if (grades[i] < 1 || grades[i] > 10) {
                        System.out.println("Invalid grade! Please enter a grade between 1 and 10");
                    }

                } catch (Exception e) {

                    System.out.println("Invalid grade! Please enter a grade between 1 and 10");
                    scanner.nextLine();
                }

            } while (grades[i] < 1 || grades[i] > 10);
        }

        boolean allStudentsassed = true;
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + students[i] + " has grade " + grades[i]);

            if (grades[i] < 5) {
                allStudentsassed = false;
            }
        }
        if (allStudentsassed) {
            System.out.println("All students passed");
        }
    }
}
