class Animal
{
    private String name; //Cannot use outside class
    private int id;

    public void Print(){
        System.out.println("Name: " + name + ", Id: " + id);
        f1(); //Can call private function here inside the class
    }

    private void f1(){
        System.out.println("PRIVATE FUNCTION");
    }

    /// Getter for name
    public String getName(){
        return name;
    }

    ///  Setter for name
    public void setName(String name){
        this.name = name;
    }

    //Getter and Setter for id, can use Generate
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Code1 {

    public static void main(String[] args) {

        Animal a1 = new Animal();

        //  a1.name = "Tom"; //Private, cannot use outside class
        a1.setName("Tom");
        System.out.println("Name: " + a1.getName());

      //  a1.id = 10;
        a1.setId(10);
        System.out.println("Id: " + a1.getId());

        a1.Print();
        // a1.f1(); //Private Function, can be called only inside class

    }

}
