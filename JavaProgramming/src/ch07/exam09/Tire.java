package ch07.exam09;

public abstract class Tire {
	//Field
	int diameter;
	//Constructor
	Tire(){
		System.out.println("Tire ��ü ����");
	}
	
	//Method
	

	abstract void roll();
//	�����̾��� �޼ҵ�
	
	public int getDiameter() {
		return diameter;
	}


	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}


	
	
}
