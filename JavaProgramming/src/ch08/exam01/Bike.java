package ch08.exam01;

public class Bike implements Manual{ // 인터페이스를 구현한 클래스 표시 : "implements"
	// 선언 먼저 하고 갖다 대면 오버라이드 할 메소드들을 자동완성 시켜줌(오류메시지 밑에 클릭하면) 
	// 작성순서 : implements (인터페이스) ->  ctrl + space 눌러서 재정의 자동완성 시켜라
	
	
	//Field
	private int speed;
	//Constructor
	
	//Method
	// 인터페이스에는 메소드에 public이 없지만, 구현 클래스에서는 다 붙여줘야 함 (접근제한의 문제 때문에)
	// "재정의된 메소드" 라고 부름
	
	@Override
	public void turnOn(){ 
		System.out.println("전동 자전거를 구동합니다");
	}
	
	@Override
	public void turnOff(){
		System.out.println("전동 자전거를 끕니다");
	}
	@Override
	public void setSpeed(int speed){
		System.out.println("속도를 " + speed + "로 변경합니다.");
		this.speed = speed;
		
	}
	@Override
	public int getSpeed(){
		return speed;
	}
	@Override
	public void run(){
		System.out.println("전동 자전거가 " + speed + "속도로 달립니다.");
	}
}

