class Car
{
    String name;
    String color;
    String model;

    // Constructor made using generate option
    public Car(String name) {
        this.name = name;
    }

    //Constructor using 3 variables
    Car(String name, String color, String model)
    {
        this.name = name; //this.name is the class variable, name is the parameter
        this.color = color;
        this.model = model;
    }

    Car(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    Car() //Can also have the default constructor with no parameter
    {

    }

    void Print()
    {
        System.out.println("Name: " + name + ", Color: " + color + ", Model: " + model);
    }
}

public class Code3 {

    public static void main(String[] args) {

        Car c1 = new Car("Corolla","Silver","XYZ");
        c1.Print();

       /* double d = 3.556;
        System.out.printf("d = %.2f \n", d); */ //For printing 2 dp format

        Car c2 = new Car("Allion", "Black");
        c2.Print();

        Car c3 = new Car(); //Compiler automatically picks the constructors
        c3.Print();


    }

}
