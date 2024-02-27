abstract class Account{
	private int accountnumber;
	private double balance;
	Account(int acc,double bal){
		setAccountnumber(acc);
		balance=bal;
	}
	abstract void withdrawal(double a);
	abstract void deposit(double a);
	void setBalance(double newBalance) {
		balance=newBalance;
	}
	double getBalance(){
		return balance;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
}
class SavingsAccount extends Account{
  double interest;
  SavingsAccount(double ir,int acc,double bal){
	  super(acc,bal);
	  interest=ir;
  }
  public void withdrawal(double a) {
	  double bal=getBalance();
	  if(bal-a<0) {
		System.out.println("Insufficient balance");  
	  }
	  else {
		  setBalance(bal-a);
		  System.out.println("Amount withdrawn !! Available Balance: "+(bal-a));
	  } 
  }
  public void deposit(double a) {
	  double bal=getBalance();
	  double overall=bal+(bal*interest)/100;
	  setBalance(overall);
	  System.out.println("Amount Deposited !! Available Balance: "+overall);
  }
}
class CurrentAccount extends Account{
	double limit;
	CurrentAccount(double l,int acc,double bal){
		  super(acc,bal);
		  limit=l;
	  }
	  public void withdrawal(double a) {
		  double bal=getBalance();
		  if(a>bal && a >limit+bal) {
			System.out.println("Amount exceeds overdraft limit");
		  }
		  else if(a>bal && limit+bal>a){
			  setBalance(bal-a);
			  System.out.println("Amount withdrawn !! Available balance: "+(bal-a));
		  }
	  }
	  public void deposit(double a) {
		  double bal=getBalance();
		  setBalance(bal);
		  System.out.println("Amount Deposited !! Available Balance: "+bal);
	  }
}
public class q07 {

	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount(2.7,94763,65000.00);
		CurrentAccount c=new CurrentAccount(50000,657464,50000.00);
		s.withdrawal(24000);
		s.deposit(4000);
		c.withdrawal(4500);
		c.deposit(3000);
	}

}
