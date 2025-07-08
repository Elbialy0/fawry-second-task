package model;

import java.time.LocalDate;

public class Book implements Type {
    private String isbn;
    private String title;
    private LocalDate publicationDate;
    private double price;

    public Book(String isbn, String title, LocalDate publicationDate, double price) {
        this.isbn = isbn;
        this.title = title;
        this.publicationDate = publicationDate;
        this.price = price;
    }

    public Book() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean isForSale() {
        return true;
    }
}
