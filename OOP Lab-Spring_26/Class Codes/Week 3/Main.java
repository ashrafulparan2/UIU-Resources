class Book{
    String title;
    int pages;
    Book()
    {
        title = "No Title";
        pages=0;
    }
    Book(String title)
    {
        this.title = title;
    }
    Book(String title, int pages)
    {
        this.title = title;
        this.pages=pages;
    }
    Book(Book b)
    {
        title = b.title;
        pages=b.pages;
    }
    void display()
    {
        System.out.println("Title: "+ title+ " Pages: "+ pages);
    }
}





public class Main{
    public static void main(String[] args)
    {

        Book b1 = new Book();
        Book b2 = new Book("B2");
        Book b3 = new Book("B3", 150);
        Book b4 = new Book(b2);

        b1.display();
        b2.display();
        b3.display();
        b4.display();


    }
}
