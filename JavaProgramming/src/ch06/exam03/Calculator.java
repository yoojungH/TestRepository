package ch06.exam03;

//Ctrl+shift+O
//import ch06.exam02.Car;

//객체를 만들기 위한 설계도
public class Calculator {
	//Field
	
	//Constructor
	
	//Method
	void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	void powerOff(){
		System.out.println("전원을 끕니다.");
	}
	String info(){
		return "삼성전자-2017-03-28";
	}
	int[] changeArray(int x, int y, int z){
		int[] array = {x,y,z};
		return array;
	}
	Car makeCar(String color, boolean airbag){
		Car car= new Car(color, airbag);
		return car; 
		//만든 객체의 번지(주소)를 return 해야함
	}
	int plus(int x, int y){
		int result = x+y;
		return result;
	}
	
	//메소드 오버로딩
	double plus(double x, double y){
		double result = x+y;
		return result;
	}
	
	double divide(double x, double y){
		double result = x/y;
		return result;
	}
}
