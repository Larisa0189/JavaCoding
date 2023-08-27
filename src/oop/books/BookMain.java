package oop.books;

public class BookMain {
    public static void main(String[] args) {
        Book anotherBook = new Book();
        /*il poti acesa fiindca este defoul si clasa aceasta este in acelasi
        pachet ca cel in care a fost initializat;*/
        anotherBook.title = "Luceafarul";
    }
}
