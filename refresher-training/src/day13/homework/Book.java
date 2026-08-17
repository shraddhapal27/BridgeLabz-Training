package day13.hackerrank.LibraryBook;

public class Book {
    static long totalBooksInLibrary;
    static long totalBooksCheckedOut;
    String title;
    String author;
    String isBn;

    boolean isChecked;

    Book(String title, String author, String isBn){
        this.title = title;
        this.author = author;
        this.isBn = isBn;

        totalBooksInLibrary++;
    }

    void checkOut(){
        totalBooksCheckedOut++;
    }

    void returnBook(){
        totalBooksCheckedOut--;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", "James", "101");
        Book b2 = new Book("DSA", "Rahul", "102");
        Book b3 = new Book("DBMS", "Ankit", "103");
        Book b4 = new Book("OS", "John", "104");
        Book b5 = new Book("Networks", "David", "105");

        // Check out 3 books
        b1.checkOut();
        b2.checkOut();
        b3.checkOut();

        // Return 1 book
        b1.returnBook();

        // Print counters
        System.out.println("Total books: " + Book.totalBooksInLibrary);
        System.out.println("Total books checked out: "
                + Book.totalBooksCheckedOut);
    }

}
