package ch10.exam05;

public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException() {
		//super(); 가 생략되어있음.
	}
	public BalanceInsufficientException(String message){
		super(message);
	}
}
