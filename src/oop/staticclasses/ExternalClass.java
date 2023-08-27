package oop.staticclasses;

public class ExternalClass {


    public static class InternalClass {
        public void print(String text) {
            System.out.println(text);
        }
    }


    public InternalClass init() {
        return new InternalClass();
    }

}
