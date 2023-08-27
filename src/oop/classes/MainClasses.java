package oop.classes;

import oop.books.Book;

public class MainClasses {
    public static void main(String[] args) {
        Movie oppenheimer = new Movie();
        oppenheimer.setTitle("Oppenheimer");
        oppenheimer.setDurationInMinute(180);

        oppenheimer.play();
        oppenheimer.stop();

        System.out.println(oppenheimer.getTitle());
        System.out.println(oppenheimer.getDurationInMinute());

        System.out.println("-----------------------------------");

        Car car1 = new Car("alb", "Dacia", 150);
        car1.printAllCarParameters();
        car1.setColor("red");
        car1.printAllCarParameters();
        System.out.println(car1.getBrand());

        Car car2 = new Car("BMW", 200);
        car2.setColor("albastra");

        Car car3 = new Car(250, "gri", "Audi");

        car2.printAllCarParameters();
        car3.printAllCarParameters();

        System.out.println("-----------------------------------");

        Book book1 = new Book();
        book1.author = "Eminescu";/*Asta poate fi accesata aici fiindca e public
        defoult title ai acces doar in clasele din acelasi pachet.*/
        book1.setNumberOfPages(50);


        System.out.println("Autorul cartii este " + book1.author + ", numarul de pagini este " + book1.getNumberOfPages());
        oop.anotherBooks.Book bookFromAnother = new oop.anotherBooks.Book();
        //Accesarea clasei book cu acelasi nume dar alt pachet.
    }
}
