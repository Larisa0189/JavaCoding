package arrays;

public class ArrayExercices {
    public static void main(String[] args) {
        ArrayExercices object = new ArrayExercices();
        String[] arrayOfString = {"Maria", "Bong", "Card", "Teleenciclopedie", "scurt"};
        System.out.println(object.findTheLongestText(arrayOfString));
    }

    String findTheLongestText(String[] arrayOfText) {
        String longestText = "";
        for (String myText : arrayOfText) {
            if (longestText.length() < myText.length()) {
                longestText = myText;
            }
        }
        return longestText;
    }

}
