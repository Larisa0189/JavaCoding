package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Te rog introdu un text care sa fie verificat daca indeplineste sau nu patternul");
        String text = scanner.nextLine();

        Pattern pattern1 = Pattern.compile("alo+");
        //alo, aloo, alooo, aloooo, etc.
        Matcher matcher = pattern1.matcher(text);
        System.out.println(matcher.matches());

        //Poti pune [a-zA-Z0-0]
        Pattern pattern2 = Pattern.compile("[a-z]*");
        //"", "x", "fx", "drh", "ysbf", etc;
        System.out.println("Introdu litere mici");
        Matcher macher2 = pattern2.matcher(scanner.nextLine());
        System.out.println("Textul introdus verifica patternul: " + macher2.matches());
        System.out.println("Textul introdus contine o parte corecta " + macher2.find());
        scanner.close();
    }
}
