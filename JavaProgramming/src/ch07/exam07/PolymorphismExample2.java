package ch07.exam07;

public class PolymorphismExample2 {
	public static void main(String[] args) {
		Tire tire1 = new Tire();
		NormalTire tire2 = new NormalTire();
		SnowTire tire3 = new SnowTire();
		
		//�ڵ� Ÿ�� ��ȯ
		tire1=tire2;
		//���� Ÿ�� ��ȯ
		tire2=(NormalTire)tire1;
		
		//�ڵ� Ÿ�� ��ȯ
		tire1=tire3;
		//���� Ÿ�� ��ȯ
		tire3=(SnowTire)tire1;
		
		//run();
	}
	
    static void run(Tire tire){
		
	}
//	public static void run(Tire tire){
//		
//	}
}
