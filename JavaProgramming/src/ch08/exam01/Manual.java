package ch08.exam01;

public interface Manual { // 인터페이스 디폴드 값 : public
	//Field
	 String COMPANY = "삼성전자"; // 기본적으로 public static final 생략
	 int MAX_VOLUME = 150;
	 int MIN_VOLUME = 0;
	int MAX_SPEED = 0;
	int MIN_SPEED = 0;
	 
	 //Method
	 //설명서 역할
	 
	 void turnOn(); //  기본적으로 public abstract 생략 , 현업에서 이거 붙이면 혼남!!!!!!
	 				//  선언만 하고 블록 실행부 없어야 함
	 void turnOff();
	 void setSpeed(int speed); 
	 int getSpeed();
	 void run();
	 
	 //실행부는 인터페이스로 사용할 수 있는 객체에서 수행
	 //인터페이스로 사용 가능한 객체: 최소한 인터페이스에 있는 내용을 갖고 있어야 함 => "인터페이스를 구현한 객체" 라고 부름
	 //이와 같은 메소드가 실제 객체 안에 있어야 함. -> 나중에 인터페이스에서 호출할 수 있도록
	
}
