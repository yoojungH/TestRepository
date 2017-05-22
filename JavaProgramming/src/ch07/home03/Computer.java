package ch07.home03;
//자식 클래스
public class Computer extends Calculator{
	
	//Method
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
}
