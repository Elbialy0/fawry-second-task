# Book Store

This system is a **Java-based application** that manages different types of books:
- E-books
- Paper books
- Demo books

It provides functionality to:
- Add new books  
- Remove outdated books  
- Buy books  

---

## 📁 Project Structure

online-book-store/
├── .gitignore
├── .idea/
├── online-book-store.iml
└── src/
├── dto/
│ ├── EmailBookDto.java
│ └── ShippingBookDto.java
├── model/
│ ├── Book.java
│ ├── Type.java
│ ├── EBook.java
│ ├── DemoBook.java
│ └── PaperBook.java
├── Service/
│ ├── MailService.java
│ ├── ShippingService.java
│ └── InventoryService.java
└── Main.java
