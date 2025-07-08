package model;

import java.time.LocalDate;

public class PaperBook extends Book  implements Type{
    private double weight;
    private int quantity;

    public PaperBook(String isbn, String title, LocalDate publicationDate, double price, double weight, int quantity) {
        super(isbn, title, publicationDate, price);
        this.weight = weight;
        this.quantity = quantity;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean isForSale() {
        return true;
    }
}
