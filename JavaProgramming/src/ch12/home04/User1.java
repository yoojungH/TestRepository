package ch12.home04;

public class User1 extends Thread{
	//Field --- 객체 생성
	private Calculator calculator;

	//외부에서 Calculator 이름 바꿔주기
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	//run method 재정의
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
}
