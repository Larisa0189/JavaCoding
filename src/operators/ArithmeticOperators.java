package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int number = 7;
        System.out.println("Number is: " + number);

        int anotherNumber = ++number;
        System.out.println(anotherNumber);

        System.out.println("Number is: " + number);

        anotherNumber = --number;
        System.out.println(number);
    }
}
