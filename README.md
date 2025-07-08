# Online Book Store

A Java-based application for managing different types of books in a store inventory.

## Features

- Manage three types of books:
  - E-books (digital)
  - Paper books (physical)
  - Demo books (samples/previews)
  
- Core functionality:
  - Add new books to inventory
  - Remove outdated books
  - Buy books

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
