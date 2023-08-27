package input;

import java.util.Scanner;

public class ScannerSimpleExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Te rog introdu de la tastatura un text");
        String inputFromUser = scan.nextLine();
        System.out.println(inputFromUser.toUpperCase());

        System.out.println("Te rog introdu un numar intreg");
        byte byteNumberFromUser = scan.nextByte();
        System.out.println(byteNumberFromUser);

        System.out.println("Te rog introdu un numar intreg");
        int intNumberFromUse = scan.nextInt();
        System.out.println(intNumberFromUse);

        System.out.println("Te rog introdu un numar cu virgula");
        double doubleNumbetFromUser = scan.nextDouble();
        System.out.println(doubleNumbetFromUser);
    }
}
