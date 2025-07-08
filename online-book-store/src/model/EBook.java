package model;

import java.time.LocalDate;

public class EBook extends Book  implements Type{
    private String fileType;

    public EBook(String isbn, String title, LocalDate publicationDate, double price, String fileType) {
        super(isbn, title, publicationDate, price);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean isForSale() {
        return true;
    }
}
