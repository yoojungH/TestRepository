package ch07.home06;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2"; //불가
		//parent.method3();		   //불가
		
		Child child = (Child)parent;
		child.field2 = "yyy";
		child.method3();
	}
}
