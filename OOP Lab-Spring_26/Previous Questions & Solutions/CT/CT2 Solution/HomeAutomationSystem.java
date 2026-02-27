interface Connectable
{
    void connectToWifi(String network);
    void disconnectWiFi();
}

abstract class SmartDevice
{
    String name;
    boolean powerStatus;

    public SmartDevice(String name) {
        this.name = name;
        this.powerStatus = false;
    }

    public void turnOn()
    {
        powerStatus = true;
    }

    public void turnOff()
    {
        powerStatus = false;
    }

    public abstract void showStatus();
}

class SmartLight extends SmartDevice implements Connectable
{
    int brightness;

    public SmartLight(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    @Override
    public void connectToWifi(String network) {
        System.out.println("Connected to " + network);
    }

    @Override
    public void disconnectWiFi() {
        System.out.println("Wifi Disconnected");
    }

    public void showStatus(){
        System.out.println("Name: " + name);
        System.out.println("Power Status: " + powerStatus);
        System.out.println("Brightness: " + brightness);
    }

    public void adjustBrightness(int value){
        if(value<0 || value>100) System.out.println("Invalid brightness level");
        else brightness = value;
    }
}


public class HomeAutomationSystem {

    public static void main(String[] args) {

        SmartLight s1 = new SmartLight("Alo", 50);
        SmartLight s2 = new SmartLight("Noor", 80);

        s1.turnOn();
        s1.showStatus();
        s2.turnOff();
        s2.showStatus();

        s1.connectToWifi("DotNet");
        s2.disconnectWiFi();

        s1.adjustBrightness(101);
        s1.showStatus();
        s2.adjustBrightness(40);
        s2.showStatus();



    }

}
