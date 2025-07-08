package model;

import java.time.LocalDate;

public class DemoBook extends Book implements Type{
    public DemoBook(String isbn, String title, LocalDate publicationDate, double price) {
        super(isbn, title, publicationDate, price);
    }

    @Override
    public boolean isForSale() {
        return false;
    }
}
