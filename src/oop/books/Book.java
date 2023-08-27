package oop.books;

public class Book {

    String title; //default il poti folosi doar in acelasi pachet;
    public String author; //public il poti folosi peste tot;
    private int numberOfPages; //private il poti folosi doar aici, in clasa aceasta

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("The number of page is incorect");
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private boolean isNumberOfPagesValid(int nOfPages) {
        return nOfPages > 0;
    }//Metoda aceasta poate fi folosita doar in aceasta clasa
}
