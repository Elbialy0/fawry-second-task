#Book Store 
This System is a java-based application that manages different types of books(E-books, Paper books, and Demo books)
It provides functionality for adding books, remove outdated books and by books

## Project Structure 

online-book-store/
├── .gitignore
├── .idea/
├── online-book-store.iml
└── src/
    ├── dto/
    │   ├── EmailBookDto.java
    │   └── ShippingBookDto.java
    ├── model/
    │   ├── Book.java
    │   ├── Type.java
    │   ├── EBook.java
    │   ├── DemoBook.java
    │   └── PaperBook.java
    ├── Service/
    │   ├── MailService.java
    │   ├── ShippingService.java
    │   └── InventoryService.java
    └── Main.java
