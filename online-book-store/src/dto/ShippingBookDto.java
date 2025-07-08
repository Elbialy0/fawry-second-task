package dto;

public class ShippingBookDto {
    private String isbn;
    private double price;
    private double weight;
    private String address;
    private int quantity;
    private String email;


    public ShippingBookDto(String isbn, double price, double weight, String address, int quantity, String email) {
        this.isbn = isbn;
        this.price = price;
        this.weight = weight;
        this.address = address;
        this.quantity = quantity;
        this.email = email;
    }

    public ShippingBookDto() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
