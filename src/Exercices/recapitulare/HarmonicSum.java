package Exercices.recapitulare;

import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar cu care vom face suna harmonic");
        int number = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += 1 / (double) i;
        }
        System.out.println(sum);
    }
}
