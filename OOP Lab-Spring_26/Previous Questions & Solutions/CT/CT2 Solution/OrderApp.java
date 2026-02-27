class InvalidQuantityException extends RuntimeException
{
    InvalidQuantityException(String msg)
    {
        super(msg);
    }
}

class Order
{
    String item;
    int quantity;
    double pricePerItem;

    public Order(String item, int quantity, double pricePerItem) {
        this.item = item;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double calculateTotal() throws InvalidQuantityException
    {
        if(quantity<=0) throw new InvalidQuantityException("Wrong amount");
        return quantity * pricePerItem;
    }

    public void checkItemPrice(double price) throws Exception
    {
        if(price<=0) throw new Exception("Wrong Price");
        System.out.println("Price is valid");
    }
}

public class OrderApp {

    public static void main(String[] args) {
        Order o1 = new Order("Burger",4,250);
        Order o2 = new Order("Cake", -10, 500);

        try
        {
            System.out.println(o1.calculateTotal());
            System.out.println(o2.calculateTotal());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Order processed");
        }

        try
        {
            o1.checkItemPrice(100);
            o2.checkItemPrice(-10);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Order processed");
        }


    }

}
