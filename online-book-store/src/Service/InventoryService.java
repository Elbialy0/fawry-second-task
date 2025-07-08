package Service;

import dto.EmailBookDto;
import dto.ShippingBookDto;
import model.Book;
import model.EBook;
import model.PaperBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InventoryService {

    private List<Book> books;

    public InventoryService(List<Book> books) {
        this.books = books;
    }

    public InventoryService() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void AddBook(Book book) {
        books.add(book);
    }
    public void RemoveBook(Book book) {
        books.remove(book);
    }
    public void UpdateBook(Book book) {
        books.set(books.indexOf(book), book);
    }
    public List<Book> removeOutdatedBooks(int numOfYears){
        List<Book> outdatedBooks = new ArrayList<>();
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()){
            Book book = iterator.next();
            if (LocalDate.now().getYear()-book.getPublicationDate().getYear()>numOfYears){
                outdatedBooks.add(book);
                iterator.remove();
            }
        }

        return outdatedBooks;
    }

    public double buyBook(String isbn, int quantity,String address,String email) {
        Book returnedBook = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                returnedBook = book;
                break;
            }
        }
        if (returnedBook == null) {
            throw new RuntimeException("Book not found");
        }
        if(returnedBook instanceof PaperBook) {
            if(((PaperBook) returnedBook).getQuantity()<quantity){
                throw new RuntimeException("Paper book does not have enough quantities");
            }
            else {
                int updatedQuantity = ((PaperBook) returnedBook).getQuantity()-quantity;
                ((PaperBook) returnedBook).setQuantity(updatedQuantity);
                books.set(books.indexOf(returnedBook), returnedBook);
                ShippingBookDto shippingBook = new ShippingBookDto(isbn,returnedBook.getPrice(),((PaperBook) returnedBook).getWeight(),
                address,quantity,email);
                return ShippingService.shipping(shippingBook);


            }
        }
       if(!returnedBook.isForSale()){
           throw new RuntimeException("Book is not for sale");
       }
       MailService.sendMail(new EmailBookDto(isbn,((EBook)returnedBook).getFileType(),email,returnedBook.getPrice(),
               quantity));
       return returnedBook.getPrice()*quantity;

    }



}
