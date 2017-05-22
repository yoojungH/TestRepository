package ch08.exam01;

public class Car implements Manual{
	
	//field
	private int speed;
	
	
	//method
	@Override
	public void turnOn() {
		System.out.println("자동차를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("자동차를 끕니다");
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("속도를 " + speed + "로 변경합니다.");
		if(speed < Manual.MIN_SPEED){
			this.speed = Manual.MIN_SPEED;
		}else if(speed > Manual.MAX_SPEED ){
			this.speed = Manual.MAX_SPEED;
		}else{
			this.speed = speed;
		}
	
	}

	@Override
	public int getSpeed() {
		return speed;
		//return 0;
	}

	@Override
	public void run() {
		System.out.println("자동차가 " + speed + "속도로 달립니다.");
	}
	
	public void sound(){ // Manual을 통해 sound() 호출 불가능
		
	}
	
	
	/*
	 * [인터페이스 -> 클래스로 바꿀 수 있는 방법?]
	 * -> Casting 사용
	 * 
	 * 
	 * */
	
	
}
