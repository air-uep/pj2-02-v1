package pl.air.bookstore;

import pl.air.bookstore.model.Author;
import pl.air.bookstore.model.Book;
import pl.air.bookstore.model.Publisher;

public class Application {

    public static void main(String[] args) {
        Author am = new Author("Adam", "Mickiewicz");
        am.setProfile("(1798-1855)");

        Publisher nk = new Publisher("Nasza Księgarnia");
        nk.setLocation("Warszawa");

        Book panT = new Book("Pan Tadeusz", nk, am);
        panT.printInfo();
    }
}
