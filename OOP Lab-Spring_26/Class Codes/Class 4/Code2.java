class Car{
    String name;
    String modelNo;

    Car(String name, String modelNo){
        this.name = name;
        this.modelNo = modelNo;
    }

    // Car(){} //Can create a default constructor, super() will not be needed

    void Brake(){
        System.out.println("Stop the car");
    }

    void Accelerate(){
        System.out.println("Speed Up");
    }

    void Start(){
        System.out.println("Vroom Vroom");
    }
}

class Toyota extends Car{ //Toyota inherits all variable and function of Car class

    String carType;

    Toyota(String name, String modelNo, String carType){
        super(name, modelNo); // To use parent constructor, must use super() first if parent constructor is present
        this.carType = carType;
    }

    void FastDrive(){
        System.out.println("Toyota goes Vroom Vroom");
    }

}


public class Code2 {

    public static void main(String[] args) {

        Car c1 = new Car("Gari", "Dhaka Metro A");
        c1.Accelerate();
        c1.Brake();
        c1.Start();
        //c1.FastDrive(); // no FastDrive() method in Car

        Toyota t1 = new Toyota("Toyota Gari", "Chittagong Metro B", "Allion");
        t1.Accelerate();
        t1.Brake();
        t1.Start();
        t1.FastDrive();

    }
}
