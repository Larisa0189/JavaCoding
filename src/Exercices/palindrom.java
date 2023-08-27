package Exercices;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Te rog introdu de la tastatura un cuvant");
        String cuvant = scan.nextLine();

        boolean isPalindrome = cuvant.equals(new StringBuilder(cuvant).reverse().toString());
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
