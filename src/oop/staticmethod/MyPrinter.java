package oop.staticmethod;

public class MyPrinter {

    public static void printNumber(int number) {
        System.out.println("Numarul este " + number);
    }


    public static String formatTime(int sec) {
        int min = 0;
        int h = 0;
        if (sec >= 60) {
            min = sec / 60;
            sec = sec % 60;
            if (min >= 60) {
                h = min / 60;
                min = min % 60;
            }
        }
        return h + "h " + min + "min " + sec + "sec";
    }

}
