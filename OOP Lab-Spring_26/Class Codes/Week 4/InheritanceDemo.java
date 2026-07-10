class Animal{
    void eat()
    {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void meow()
    {
        System.out.println("Cat meows");
    }
}

class Puppy extends Dog{
    void weep()
    {
        System.out.println("Puppy weeps");
    }
}

class Vehicle{
    void Start()
    {
        System.out.println("Engine Starting");
    }
    void Stop()
    {
        System.out.println("Engine Stopping");
    }
}

class Car extends Vehicle{
    void accelerate()
    {
        System.out.println("Car accelerating");
    }
}

class Sportscar extends Car{
    void nitroboost()
    {
        System.out.println("Nitroboost activated");
    }
}




public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat();
        d.bark();

        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();


        Sportscar sp= new Sportscar();
        sp.Start();
        sp.accelerate();
        sp.nitroboost();
        sp.Stop();

    }
}