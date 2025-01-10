class BankAccount
{
    int account_number;
    double account_balance;

    // default parameter
    public BankAccount()
    {
        this.account_number = 0;
        this.account_balance = 0.0;
    }
    //parameterized parameter
    public BankAccount(int account_number, double account_balance)
    {
        this.account_number = account_number;
        this.account_balance = account_balance;
    }

    public void withdraw(double amt)
    {
        if(amt > account_balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            account_balance -= amt;
            System.out.println("Withdrawn: " +amt);
        }
    }

    public void deposit(double amt)
    {
        if(amt > 0)
        {
            account_balance += amt;
            System.out.println("Deposited: "+amt);
        }
        else
        {
            System.out.println("Invalid");
        }
    }

    public void check_balance()
    {
        System.out.println("Current Balance: "+account_balance);
    }

}
public class Main4 
{
    public static void main(String args[])
    {
        BankAccount acc1 = new BankAccount();
        acc1.deposit(1500);
        acc1.withdraw(1000);
        acc1.check_balance();

        BankAccount acc2 = new BankAccount(223344008, 2000);
        acc2.check_balance();
        acc2.deposit(1500);
        acc2.withdraw(500);
        acc2.check_balance();
    }
}
