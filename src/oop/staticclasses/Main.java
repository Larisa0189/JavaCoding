package oop.staticclasses;

import oop.classes.OuterClass;

public class Main {
    public static void main(String[] args) {
        ExternalClass objectFromExternalClass = new ExternalClass();

        ExternalClass.InternalClass objectFromInternalClass = objectFromExternalClass.init();
        ExternalClass.InternalClass anotherObjectFromInternalClass = new ExternalClass.InternalClass();

        objectFromInternalClass.print("Some text");
        anotherObjectFromInternalClass.print(("Another text"));
    }
}
