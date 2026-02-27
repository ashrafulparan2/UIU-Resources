class NorthEnd
{
    static Coffee makeCoffee(String order)
    {
        if(order == "Latte") return new Latte();

        if(order == "Cappuchino") return new Cappuchino();

        if(order == "Mocha") return new Mocha();

        return null;
    }
}

class Coffee
{
    void drink()
    {
        System.out.println("Drinking Coffee");
    }
}

class Mocha extends Coffee
{
    void drink()
    {
        System.out.println("Drinking Mocha");
    }
}

class Cappuchino extends Coffee
{
    void drink()
    {
        System.out.println("Drinking Cappuchino");
    }
}

class Latte extends Coffee
{
    void drink()
    {
        System.out.println("Drinking Latte");
    }
}


public class Code4 {

    public static void main(String[] args) {

        Coffee c1 = NorthEnd.makeCoffee("Latte");
        c1.drink();

        Coffee c2 = NorthEnd.makeCoffee("Mocha");
        c2.drink();
    }
}
