package ch10.exam06;

public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException() {
		//super(); 가 생략되어있음.
	}
	public BalanceInsufficientException(String message){
		super(message);
	}
}
