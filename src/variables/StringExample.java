package variables;

public class StringExample {
    public static void main(String[] args) {
        String text = "This is a text";
        System.out.println(text);
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        System.out.println("length of text is : " + text.length());

        System.out.println(text.concat(" ").concat("alt text"));

        System.out.println("text is of index : " + text.indexOf("text"));

        String anotherText = "THIS IS A TEXT";

        System.out.println(text.equals(anotherText));

        System.out.println(text.equalsIgnoreCase((anotherText)));

        System.out.println(anotherText.replaceAll(" ", ","));

        System.out.println(anotherText.contains("IS"));

        System.out.println(text + "\n" + anotherText);


    }
}
