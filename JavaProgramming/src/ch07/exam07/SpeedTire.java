package ch07.exam07;

public class SpeedTire extends Tire {
	
	//다형성으로 사용하려면 재정의가 필요
	@Override
	void roll() {
		System.out.println("스피드 타이어가 굴러갑니다.");
	}
}
