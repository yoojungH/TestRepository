package ch10.exam06;

public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException() {
		//super(); �� �����Ǿ�����.
	}
	public BalanceInsufficientException(String message){
		super(message);
	}
}
