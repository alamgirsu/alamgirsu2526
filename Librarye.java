package librarye;

public class Librarye {

    String bookName;
    String authorName;
    int quantity;

    Librarye(String bookName, String authorName, int quantity) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("\nBook Name: " + bookName 
        + "\nAuther Name : " + authorName + "\nQuantity : " + quantity);
    }

    public static void main(String[] args) {
        Librarye book1 = new Librarye("Physics", "Alamgir ", 3);
        book1.display();
        Librarye book2  = new Librarye("CSE", "Computer ", 3);

        book2.display();
    }
} 
