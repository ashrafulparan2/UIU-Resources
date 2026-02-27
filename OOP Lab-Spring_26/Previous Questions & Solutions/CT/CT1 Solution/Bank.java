class BankAccount
{
    final String bankName;
    String accountName;
    double balance;
    int accountNumber;

    BankAccount()
    {
        System.out.println("Welcome to the Bank Account System");
        balance = 0;
        accountName = "NEW";
    }

    public BankAccount(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        System.out.println("Welcome to the Bank Account System");
        DisplayAccountInfo();
    }

    {
        bankName = "Invalid";
        System.out.println("Initializing Banking Protocol");
    }

    static
    {
        System.out.println("Entering Bank Universe");
    }

    void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited " + amount + " Tk in the account");
    }

    void withdraw(double amount)
    {
        if(amount>balance)
            System.out.println("Insufficient funds");
        else
            balance -= amount;
    }

    void DisplayAccountInfo()
    {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    void TransferMoney(BankAccount b, double amount)
    {
        if(amount>balance)
            System.out.println("Insufficient funds");
        else{
            b.deposit(amount);
            withdraw(amount);
        }
    }
}

public class Bank {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(10,"Somik", 10000);

        System.out.println("*********************************************************");

        b1.DisplayAccountInfo();
        b2.DisplayAccountInfo();

        System.out.println("*********************************************************");

        b1.deposit(1000);
        b1.DisplayAccountInfo();

        System.out.println("*********************************************************");

        b1.withdraw(500);
        b1.DisplayAccountInfo();

        System.out.println("*********************************************************");

        b2.TransferMoney(b1,5000);

        b1.DisplayAccountInfo();
        b2.DisplayAccountInfo();

        System.out.println("*********************************************************");
    }

}
