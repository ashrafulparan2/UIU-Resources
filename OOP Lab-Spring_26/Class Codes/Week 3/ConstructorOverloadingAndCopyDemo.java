class BookExample {
    String title;
    int pages;

    BookExample() {
        title = "No Title";
        pages = 0;
    }

    BookExample(String title) {
        this.title = title;
        pages = 0;
    }

    BookExample(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    BookExample(BookExample other) {
        title = other.title;
        pages = other.pages;
    }

    void display() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }
}

public class ConstructorOverloadingAndCopyDemo {
    public static void main(String[] args) {
        BookExample b1 = new BookExample();
        BookExample b2 = new BookExample("Java Basics");
        BookExample b3 = new BookExample("OOP in Action", 250);
        BookExample b4 = new BookExample(b2);

        System.out.println("Constructor overloading + copy constructor demo:");
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
