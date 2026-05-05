class Device{
    double powerConsumption;

    Device(){}
    Device(double p)
    {
        powerConsumption=p;
    }

    void turnOn()
    {
        System.out.println("Device is turning on");
    }
}

class Electronics extends Device{
    int warrantyYears;
    Electronics(){}
    Electronics(double p, int w){
        super(p);
        warrantyYears=w;
    }

    void showWarranty()
    {
        System.out.println(warrantyYears);
    }
}

class SmartPhone extends Electronics{
    String osVersion;

    void turnOn()
    {
        super.turnOn();
        System.out.println("Smartphone is booting "+osVersion);
    }


}



public class DeviceInheritanceDemo {
    public static void main(String[] args) {
        SmartPhone s= new SmartPhone();
        s.turnOn();
        s.showWarranty();

    }
}