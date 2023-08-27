package oop.classes;

public class OuterClass {

    private int number;

    public class InnerClass {

        public void printNumber() {
            System.out.println(number);
        }

    }


    public InnerClass init() {
        return new InnerClass();
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
