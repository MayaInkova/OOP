package SOLID;

public class SingleResponsibilityPrinciple {

    public class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        // Метод за връщане на резюме на книгата
        public String getBookSummary() {
            return title + " by " + author;
        }
    }

    // Отделен клас за операции с базата данни за Book
    public class BookRepository {
        public void saveToDatabase(Book book) {
            // Запазване на книгата в базата данни
            System.out.println("Book saved to database: " + book.getBookSummary());
        }
    }


    public class Invoice {
        private double amount;
        private String customerName;

        public Invoice(double amount, String customerName) {
            this.amount = amount;
            this.customerName = customerName;
        }

        public double getAmount() {
            return amount;
        }

        public String getCustomerName() {
            return customerName;
        }
    }

    // Отделен клас за отпечатване на фактури
    public class InvoicePrinter {
        public void printInvoice(Invoice invoice) {
            // Принтиране на фактура
            System.out.println("Invoice for " + invoice.getCustomerName() + " Amount: " + invoice.getAmount());
        }
    }

    // Отделен клас за операции с базата данни за Invoice
    public class InvoiceRepository {
        public void saveInvoice(Invoice invoice) {
            // Запазване на фактурата в базата данни
            System.out.println("Invoice saved to database for: " + invoice.getCustomerName());
        }
    }

}
