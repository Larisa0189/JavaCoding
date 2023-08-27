package Exercices.recapitulare;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            if (number >= 1) {
                for (int i = 1; i <= number; i++) {
                    if (i % 3 == 0 && i % 7 == 0) {
                        System.out.println("FizzBuzz");
                    } else if (i % 3 == 0) {
                        System.out.println("Fizz");
                    } else if (i % 7 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }

                }
            } else {
                System.out.println("This is a negative number, please enter a positive one! ");
            }
        } while (number < 0);
    }
}
