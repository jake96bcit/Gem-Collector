package midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBook {

    @SuppressWarnings("rawtypes")
    public static void printBooks(ArrayList books) {
        int i;
        Book book;
        int length = books.size();
        
        for (i = 0; i < length ; i++) {
            book = (Book) books.get(i);
            book.show();
        }
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        String name;
        String author;
        double price;
        
        ArrayList books = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        String keepInput = "y";
        
        do {
            System.out.println("Name");
            name = scan.next();
            System.out.println("Author");
            author = scan.next();
            System.out.println("Price");
            price = scan.nextDouble();
            
            Book book = new Book(name, author, price);
            books.add(book);
            
            printBooks(books);
            System.out.println("Continue?");
            keepInput = scan.next(); 
        } while (keepInput.equals("y"));
        scan.close();
    }
}
