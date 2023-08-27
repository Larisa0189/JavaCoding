package Exercices;//package Exercices;

import java.util.Scanner;

public class Spanzuratoarea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cuvant = "_______";//ALFABETR
        int i = 0;
        System.out.println("Bun venit la jocul spanzuratoarea");
        System.out.println("Trebuie sa ghicesti cuvantul " + cuvant);
        while (i < 6) {

            System.out.println("Te rog introdu o litera");
            String litera = scan.nextLine();

            if (i < 5 && cuvant.contains("_")) {
                switch (litera) {
                    case "a":
                    case "A":
                        cuvant = 'A' + cuvant.substring(1);
                        cuvant = cuvant.substring(0, 3) + 'A' + cuvant.substring(3 + 1);
                        System.out.println(cuvant);
                        break;
                    case "l":
                    case "L":
                        cuvant = cuvant.substring(0, 1) + 'L' + cuvant.substring(1 + 1);
                        System.out.println(cuvant);
                        break;
                    case "f":
                    case "F":
                        cuvant = cuvant.substring(0, 2) + 'F' + cuvant.substring(2 + 1);
                        System.out.println(cuvant);
                        break;
                    case "b":
                    case "B":
                        cuvant = cuvant.substring(0, 4) + 'B' + cuvant.substring(4 + 1);
                        System.out.println(cuvant);
                        break;
                    case "e":
                    case "E":
                        cuvant = cuvant.substring(0, 5) + 'E' + cuvant.substring(5 + 1);
                        System.out.println(cuvant);
                        break;
                    case "t":
                    case "T":
                        cuvant = cuvant.substring(0, 6) + 'T' + cuvant.substring(6 + 1);
                        System.out.println(cuvant);
                        break;
                    default:
                        i++;
                        System.out.println("Litera gresita");
                        break;
                }
            }
            if (i >= 5) {
                System.out.println("Ai pierdut");
                scan.close();
                break;
            } else if (!cuvant.contains("_")) {
                System.out.println("Ai castigat!");
                scan.close();
                break;
            }

        }
        scan.close();
    }
}
