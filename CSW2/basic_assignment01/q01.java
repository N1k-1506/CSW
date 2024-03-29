package basic_assignment01;
class BankAccount {
    private String accountNumber;
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }
    public void setAccountNo(String a){
        accountNumber=a;
    }
    public void setBalance(double a){
        balance=a;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    } public String toString() {
        return "Account Number: " + accountNumber + ", Balance: $" + balance;
    }
}
public class q01 {
    public static void main(String[] args) {
            BankAccount account = new BankAccount();
            account.setAccountNo("123456789");
            account.setBalance(1000.0);
            System.out.println("Initial Account Details:");
            System.out.println(account);
            account.deposit(500.0);
            account.withdraw(200.0);
            System.out.println("Updated Account Details:");
            System.out.println(account);
    }
}
