package Exercices.Coding;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the input String");
        String text = scanner.nextLine();
        char[] charsText = text.toCharArray();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (charsText[i] == ' ') {
                count++;
            }
        }
        System.out.println("The number of the spaces in the text is " + count);
        try{
            if(text.length()==0){
                throw new Exception("Number is less then 1");
            }
            double procentage = (double) (count * 100) / text.length();
            System.out.format("The procentage is: %.2f %%", procentage);
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }

    }
}
