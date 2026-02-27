interface FlyingAnimal
{
    final static String type = "Flying Animal";
    // Not necessary to write final static, automatically assumed final static

    public abstract void fly();
    // Not necessary to write public abstract, automatically assumed public abstract
}

interface SwimmingAnimal
{
    String type = "Swimming Animal"; // automatically final static
    void swim(); // automatically public abstract
}

class Crow implements FlyingAnimal
{
    public void fly() // Public must, since parent method is public abstract
    {
        System.out.println("Crow flies");
    }
}

// Can implement multiple interfaces
class Swan implements FlyingAnimal, SwimmingAnimal
{
    // Must override methods of both interface
    public void fly()
    {
        System.out.println("Swan flies");
    }

    public void swim()
    {
        System.out.println("Swan swims");
    }
}

interface ParentInterface
{
    void f1();
}

// Child interface can inherit from a parent interface using extends
interface ChildInterface extends ParentInterface
{
    void f2();
}

class SomeClass implements ChildInterface
{
    // Must override both f1() and f2() since ChildInterface has both methods (1 from parent)
    public void f1(){}
    public void f2(){}
}

class SomeParentClass
{

}

// Can extend and implement together
// class Name extends Parent implements Interface1, Interface2 .....
// Only 1 parent class, interface can be more than 1

class SomeChildClass extends SomeParentClass implements FlyingAnimal, SwimmingAnimal
{
    public void fly(){}
    public void swim(){}
}

public class Code2 {

    public static void main(String[] args) {

       // FlyingAnimal f1 = new FlyingAnimal(); No Object of Interface

        FlyingAnimal f1 = new Crow(); // Subclass polymorphism
        f1.fly();

        Crow c1 = new Crow();
        c1.fly();

        Swan s1 = new Swan();
        s1.fly();
        s1.swim();

    }

}
