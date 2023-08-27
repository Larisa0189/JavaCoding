package Exercices;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("I am interrupting work");
        } else {
            boolean check = true;
            for (int i = 2; i < number / 2; i++) {

                if (number % i == 0) {
                    System.out.println(i + " " + number);
                    check = false;
                }
            }
            if (check == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
