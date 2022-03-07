public class Transaction
{
     public static void deposit(Account account,double amount)
     {
            account.setBalance(account.getBalance() - amount);
     }
     public static void withdraw(Account account,double amount)
     {
     }
}
