package Assignment3;

public class Account {

	private long accountNo;
	private double balance;
	public double deposit;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double withd) {
		if (this.balance > withd) {
			this.balance = this.balance - withd;
		}else{
			System.out.println("Insufficient balance!");
		}
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.balance = this.balance+deposit;
	}
}
