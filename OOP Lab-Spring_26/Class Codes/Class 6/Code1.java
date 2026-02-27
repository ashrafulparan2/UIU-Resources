class Animal
{
    void eat()
    {
        System.out.println("Animal eats food");
    }

    //Method Overloading
    void eat(String food)
    {
        System.out.println("Animal eats " + food);
    }

    //Method Overloading
    void eat(int amount)
    {
        System.out.println("Animal eats " + amount + " grams of food");
    }
}

public class Code1 {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.eat();
        a1.eat("Singara");
        a1.eat(100);

    }

}
