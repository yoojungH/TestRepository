package ch07.home05;

public class HankookTire extends Tire {
	//Field
	
	//Constructor 
	public HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	//Method
	@Override
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" HankookTire ����: "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** "+location+" HankookTire ��ũ ***");
			return false;
		}
	}
}
