package variables;

public class DataType {
    public static void main(String[] args) {
        //integer Number
        byte byteNumber = -128;//min -128, max 127;

        short shortNumber = (short) (byteNumber - 1);

        int intNumber = 50;

        long longNumber = Integer.MAX_VALUE + 1;

        short shortNumberTwo = (short) (125L + byteNumber);//poti pune L  sau l pentru a intelege ca e de tip long

        //Floate Number
        float floatNumber = 12.25F;//poti pune si f;

        double doubleNumber = 12.25;//poti pune D sau d dar nu e nevoie;

        float floatNumberTwo = 50.5f + floatNumber + (float) doubleNumber;

        //boolean Number
        boolean value = false;

        boolean valueTwo = value && true;

        //charecter
        //"\t"=tab, lasa spatiu pentru aliniat;
        //"\n"=a new line, trece la linia urmatoare;

        char firstCharacter = 'E';

        char newLine = '\n';

        System.out.print(newLine);
        System.out.print(firstCharacter);
        System.out.print(newLine);
        System.out.print(firstCharacter);

    }
}
