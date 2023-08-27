package oop.classes;

public class OuterInnerMain {

    public static void main(String[] args) {
        OuterClass objectFromOuterClass = new OuterClass();
        objectFromOuterClass.setNumber(5);

        OuterClass anotherObjectFromOuterClass = new OuterClass();
        OuterClass.InnerClass objectFromInnerClass = objectFromOuterClass.init();
        OuterClass.InnerClass anotherObjectFromInnerClass = anotherObjectFromOuterClass.new InnerClass();

        objectFromInnerClass.printNumber();
        anotherObjectFromInnerClass.printNumber();


    }
}
