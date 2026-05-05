class Product{
    String name;
    int code;
    double price;

    Product(){}
    Product(String n, int c, double p)
    {
        name=n;
        code=c;
        price=p;
    }
    public final int getCode()
    {
        return code;
    }
    public void show()
    {
        System.out.println("Name: "+name + " Price: "+price);
    }
}

class Toiletries extends Product {
    String expiry_date;
    Toiletries(){}
    Toiletries(String n, int c, double p, String e)
    {
        super(n, c, p);
        expiry_date=e;
    }
    public void show()
    {
        super.show();
        System.out.println("Expiry Date "+expiry_date);

    }
}

class Shampoo extends Toiletries{
    String hair_type;
    Shampoo(){}
    Shampoo(String n, int c, double p, String e, String h)
    {
        super(n, c, p, e);
        hair_type=h;
    }

    public void show()
    {
        super.show();
        System.out.println("Hair Type: "+hair_type);

    }
}

class Soap extends Toiletries{
    boolean liquid;
    Soap(){}
    Soap(String n, int c, double p, String e, boolean l)
    {
        super(n, c, p, e);
        liquid=l;
    }

    public void show()
    {
        super.show();
        System.out.println("Liquid: "+liquid);

    }
}




public class ProductHierarchyDemo {
    public static void main(String[] args) {

    }
}