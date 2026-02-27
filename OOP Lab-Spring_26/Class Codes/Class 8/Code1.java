abstract class Animal
{
    String name; //normal variable

    Animal(String name) // constructor
    {
        this.name = name;
    }

    // Complete/Concrete/Normal methods (Defined/with a body)
    public void eat()
    {
        System.out.println("Animal eats");
    }

    // Abstract Method/Incomplete method (No Body)
    // Child class must override this function
    public abstract void makeSound();

    // Abstract method is not mandatory for abstract class

}

class Dog extends Animal
{
    public Dog(String name) {
        super(name);
    }

    public void makeSound() //must override from Animal
    {
        System.out.println("Dog makes sound");
    }
}

class A
{
  //  public abstract void f1(); //Abstract method only in abstract class
}

abstract class Bird extends Animal
{
    public Bird(String name) {
        super(name);
    }

    // No need to override makeSound() since abstract class
    public abstract void fly(); // new abstract method in Bird
}

class Eagle extends Bird
{
    public Eagle(String name) {
        super(name);
    }

    public void fly() // Must override fly() from Bird
    {
        System.out.println("Eagle flies");
    }

    public void makeSound() // Must override makeSound() from Animal(Parent of Bird)
    {
        System.out.println("Eagle makes sound");
    }

}

abstract class Insect extends Animal
{
    public Insect(String name) {
        super(name);
    }

    public void makeSound() // We can override the abstract method of Parent if we want
    {
        System.out.println("Insect makes sound");
    }

    public abstract void crawl(); // New abstract method for Insect
}

class Spider extends Insect
{
    public Spider(String name) {
        super(name);
    }

    public void crawl() //Need to override only non-overridden abstract method crawl(), makeSound() is already overridden
    {
        System.out.println("Spider crawls");
    }
}

public class Code1 {

    public static void main(String[] args) {

      //  Animal a1 = new Animal("Tim"); //Cannot make object of abstract class

        Animal a1 = new Dog("Scooby"); // Subclass polymorphism - abs class reference
        a1.eat();
        a1.makeSound();

        Dog d1 = new Dog("Bull");
        d1.eat();
        d1.makeSound();

        Animal a2 = new Eagle("Big bird");
        a2.makeSound();
        a2.eat();
        // fly() (only child method)
        // cannot be used as Animal reference not Bird reference (Bird is child of Animal)

        // Animal a2 = new Bird("Bird");

        Bird b1 = new Eagle("Big Bird 2");
        b1.fly();
        b1.eat();
        b1.makeSound();

        Spider s1 = new Spider("Tom Holland");
        s1.eat(); // Animal
        s1.makeSound(); // Insect
        s1.crawl(); // Spider

    }

}
