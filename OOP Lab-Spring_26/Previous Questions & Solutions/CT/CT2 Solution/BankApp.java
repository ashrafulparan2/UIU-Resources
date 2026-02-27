class InsufficientBalanceException extends Exception{

    InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}

class Account
{
    String accNumber;
    double balance;

    public Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if(amount<=0) throw new IllegalArgumentException("Cannot deposit negative money");
        else balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if(amount>balance) throw new InsufficientBalanceException("Not enough money");
        else balance -= amount;
    }
}

public class BankApp {

    public static void main(String[] args) {

        Account a1 = new Account("111", 1000);
        Account a2 = new Account("222", 2000);

        try
        {
            a1.deposit(-100);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Transaction process completed");
        }

        try
        {
            a2.withdraw(5000);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Transaction process completed");
        }

        try
        {
            a1.deposit(100);
            a2.withdraw(1000);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Transaction porcess completed");
        }


    }

}
