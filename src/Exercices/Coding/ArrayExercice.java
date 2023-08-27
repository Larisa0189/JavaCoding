package Exercices.Coding;

public class ArrayExercice {
    public static void main(String[] args) {
        int[] grades = {10, 7, 8, 9, 5};
        String[] students = {"Jhon", "Paul", "George", "Ringo", "Max"};
        //students[i] are nota gradents[i]

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " has a grade of " + grades[i]);
        }
    }
}
