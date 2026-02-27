class Animal
{
    String name;
    int id;

    //Initialization Block - runs first when a object is created
    {
        System.out.println("Welcome to Animal Kingdom");
        name = "Animal";
    }

    static //Static Block - runs only once at the beginning, when code enters the class for the first time
    {
        System.out.println("Static Block");
    }

    void Print()
    {
        System.out.println("Name: " + name + ", ID: " + id);
    }

}


public class Code2 {

    public static void main(String[] args) {

        System.out.println("Inside Main");

        Animal a1 = new Animal();
        a1.Print();

        Animal a2 = new Animal();
        a2.Print();
        a2.name = "Cat";
        a2.id = 10;
        a2.Print();

    }

}
