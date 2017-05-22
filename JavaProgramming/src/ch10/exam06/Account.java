package ch10.exam06;

public class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money){
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money){
			//throw new BalanceInsufficientException(); //예외를 발생시킨다.
			throw new BalanceInsufficientException("잔고부족");
		}else{
			balance -= money;
		}		
	}
}
