class DomesticAnimal
{
    String name;

    void makeSound()
    {
        System.out.println("Animal makes sound");
    }

    // Method Overloading
    void makeSound(String sound)
    {
        System.out.println("Animal makes " + sound);
    }

    void Print()
    {
        System.out.println("Name: " + name);
    }
}

class Cat extends DomesticAnimal
{
    String breed;

    // Method Overriding
    void makeSound()
    {
        System.out.println("Cat makes sound meowwwwww");
    }

    void Print()
    {
        super.Print(); // calls the parent function
        System.out.println("Breed: " + breed);
    }

}

class Dog extends DomesticAnimal
{
    void makeSound()
    {
        System.out.println("Dog makes barking sound");
    }
}


public class Code2 {

    public static void main(String[] args) {

        DomesticAnimal a1 = new DomesticAnimal();
        a1.makeSound();

        Dog d1 = new Dog();
        d1.makeSound();
        d1.makeSound("Woooofffff");

        Cat c1 = new Cat();
        c1.makeSound();
        c1.makeSound("Purrrrrrr");
        c1.name = "Tom";
        c1.breed = "Persian";
        c1.Print();


    }

}
