package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 5;

        System.out.println(number1 == number2);
        System.out.println(number1 != number2);
        System.out.print('\n');


        boolean firstValue = true;
        boolean secondValue = false;

        System.out.println(firstValue == secondValue);
        System.out.println(firstValue != secondValue);
        System.out.print("\n");


        System.out.println("Check if number1 is greater than number2 : " + (number1 > number2));
        System.out.println("Check if number1 is smaller than number2 : " + (number1 < number2));
        System.out.println("Check if number1 is greater or equal than number2 : " + (number1 > number2));

    }
}
