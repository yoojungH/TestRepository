package ch07.home05;

public class Tire {
	//Field
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//Constructor 
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//Method
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" Tire ����: "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** "+location+" Tire ��ũ ***");
			return false;
		}
	}
}



//Field

//Constructor 

//Method