package oop;

import oop.staticmethod.MyPrinter;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(PI);//pentru ca am importat static

        MyPrinter.printNumber(10);
        //apelarea unei metode statice din alta clasa
        System.out.println(MyPrinter.formatTime(3652));
    }
}
