package ch07.home03;
//�ڽ� Ŭ����
public class Computer extends Calculator{
	
	//Method
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI*r*r;
	}
}
