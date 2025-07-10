package java_oops;
import java.util.*;
public class oops3b {
    private String name;
    private oops3a author;
    private double price;
    private int qtyInStock;

    public oops3b(String name, oops3a author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public oops3a getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(oops3a author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter author's name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter author's email: ");
        String authorEmail = sc.nextLine();

        System.out.print("Enter author's gender (M/F): ");
        char authorGender = sc.next().charAt(0);
        sc.nextLine(); 

        oops3a author = new oops3a(authorName, authorEmail, authorGender);

        System.out.print("Enter book name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter book price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity in stock: ");
        int qty = sc.nextInt();

        oops3b book = new oops3b(bookName, author, price, qty);

        System.out.println("\nBook Details:");
        System.out.println("Book Name: " + book.getName());
        System.out.println("Price: ₹" + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());

        System.out.println("Author Details:");
        System.out.println("Name: " + book.getAuthor().getName());
        System.out.println("Email: " + book.getAuthor().getEmail());
        System.out.println("Gender: " + book.getAuthor().getGender());

        sc.close();
    }
}