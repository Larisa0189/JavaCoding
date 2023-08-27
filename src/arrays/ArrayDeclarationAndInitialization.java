package arrays;

public class ArrayDeclarationAndInitialization {
    public static void main(String[] args) {
        String[] myStringArray = new String[5];
        myStringArray[0] = "SDA";
        myStringArray[4] = "Curs";
        myStringArray[1] = "Larisa";

        System.out.println(myStringArray[1].length());

        String[] secondStringArray = new String[]{"SDA", "Larisa", "10", "Duminica"};
        System.out.println(secondStringArray[2]);

        int[] intArray = {5, -1, 2, 6};
        intArray[2] = intArray[2] + 1;
        System.out.println(intArray[2]);

        if (myStringArray[2] != null) {
            System.out.println(myStringArray[2].toUpperCase());
        }
        System.out.println(intArray[4]);


    }
}
