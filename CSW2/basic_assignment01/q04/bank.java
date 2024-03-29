package basic_assignment01.q04;
class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String acc,double bal){
        accountNumber=acc;
        balance=bal;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    } public String toString() {
        return "Account Number: " + accountNumber + ", Balance: $" + balance;
    }
}
public class bank {
    public static void main(String[] args) {
            BankAccount account = new BankAccount("123456789",1000.0);
            System.out.println("Initial Account Details:");
            System.out.println(account);
            account.deposit(500.0);
            account.withdraw(200.0);
            System.out.println("Updated Account Details:");
            System.out.println(account);
    }
}

