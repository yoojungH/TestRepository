package ch07.home05;

public class KumhoTire extends Tire{
	//Field
	
	//Constructor 
	public KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	//Method
	@Override
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" KumhoTire ����: "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** "+location+" KumhoTire ��ũ ***");
			return false;
		}
	}
}
