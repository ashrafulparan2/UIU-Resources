class Animal{
    String name;
    Animal(){}

    Animal(String name){
        this.name=name;
    }

    void display()
    {
        System.out.println("Name: "+name);
    }
}

class Dog extends Animal{
    int id;
    Dog()
    {
//        super();
    }

    Dog(String name, int id)
    {
        super(name);
        this.id=id;
    }

    @Override
    void display()
    {
        super.display();
        System.out.println("Id: "+id);
    }
}

class Puppy extends Dog{
    int marker;
    Puppy()
    {
//        super();
    }

    Puppy(String name, int id, int marker)
    {
        super(name, id);
        this.marker=marker;
    }

    @Override
    void display()
    {
        super.display();
        System.out.println("Marker: "+marker);
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Rick", 1);
        d.display();

        Puppy p = new Puppy("Newbv", 2, 2);
        p.display();

    }
}