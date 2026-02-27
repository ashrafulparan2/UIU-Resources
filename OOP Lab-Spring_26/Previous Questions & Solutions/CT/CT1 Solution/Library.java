class LibraryBook
{
    final String libraryName;
    String bookTitle;
    boolean isAvailable;
    int bookID;

    LibraryBook()
    {
        System.out.println("Library System Initialized");
        bookTitle = "Untitled";
        isAvailable = true;
    }

    public LibraryBook(int bookID, String bookTitle, boolean isAvailable) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.isAvailable = isAvailable;
        System.out.println("Library System Initialized");
        displayBookInfo();
    }

    {
        libraryName = "UNKONWN";
        System.out.println("Loading Book Metadata...");
    }

    static
    {
        System.out.println("Accessing Library Network...");
    }

    void borrowBook()
    {
        if(isAvailable) isAvailable = false;
        else System.out.println("Book is not available");
    }

    void returnBook()
    {
        isAvailable = true;
        System.out.println("Book returned");
    }

    void displayBookInfo()
    {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book ID: " + bookID);
        System.out.println("Is Available?: " + isAvailable);
    }

    void transferBook(LibraryBook b)
    {
        String tempBookTitle = b.bookTitle;
        b.bookTitle = this.bookTitle;
        this.bookTitle = tempBookTitle;

        boolean tempAvailable = b.isAvailable;
        b.isAvailable = this.isAvailable;
        this.isAvailable = tempAvailable;

        System.out.println("Book transferred successfully");
    }
}

public class Library {

    public static void main(String[] args) {

        LibraryBook b1 = new LibraryBook();
        LibraryBook b2 = new LibraryBook(10, "Harry Potter", true);

        System.out.println("*********************************************************");

        b1.displayBookInfo();
        b2.displayBookInfo();

        System.out.println("*********************************************************");

        b1.borrowBook();
        b1.displayBookInfo();

        System.out.println("*********************************************************");

        b1.returnBook();
        b1.displayBookInfo();

        System.out.println("*********************************************************");

        b1.transferBook(b2);

        b1.displayBookInfo();
        b2.displayBookInfo();

        System.out.println("*********************************************************");



    }

}
