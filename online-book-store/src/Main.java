import Service.InventoryService;
import model.Book;
import model.DemoBook;
import model.EBook;
import model.PaperBook;

import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book java8InAction = new EBook("9785382716493","Java8InAction",
                LocalDate.of(2013,12,5),150,"PDF");

        Book java = new EBook("9785382716473","Java",
                LocalDate.of(2014,12,5),200,"PDF");

        Book cpp = new PaperBook("9785382716273","CPP",
                LocalDate.of(2014,12,5),200,400,5);

        Book c = new PaperBook("9785382716272","C",
                LocalDate.of(2014,12,5),200,4,5);

        Book python = new DemoBook("9785382710272","python",
                LocalDate.of(2014,12,5),200);

        InventoryService inventory = new InventoryService();

        inventory.AddBook(java);
        inventory.AddBook(cpp);
        inventory.AddBook(c);
        inventory.AddBook(python);
        inventory.AddBook(java8InAction);
        // try to buy Demo book
        try {

            double paidAmount = inventory.buyBook("9785382710272", 5, "Cairo", "elbialy@mail.com");
            System.out.println("Paid Amount : " + paidAmount);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
         // try to buy shipping book
        try {
            double paidAmount = inventory.buyBook("9785382716273", 5, "Cairo", "elbialy@mail.com");
            System.out.println("Paid Amount : " + paidAmount);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // try to buy ebook
        try {
            double paidAmount =  inventory.buyBook("9785382716493", 5, "Cairo", "elbialy@mail.com");
            System.out.println("Paid Amount : " + paidAmount);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
      List<Book> books = inventory.removeOutdatedBooks(5);
        System.out.println("Removed " + books.size() + " books");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }




    }
}