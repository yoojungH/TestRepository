package ch07.exam09;

public abstract class Tire {
	//Field
	int diameter;
	//Constructor
	Tire(){
		System.out.println("Tire 객체 생성");
	}
	
	//Method
	

	abstract void roll();
//	내용이없는 메소드
	
	public int getDiameter() {
		return diameter;
	}


	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}


	
	
}
