package ch06.exam07;
/* �ν��Ͻ�/Static �� */
public class Calculator {
	//Field
	static String model = "MI-84";
	static String makeDay = "2017-03-29";
	static String info; //MI-84(2017-03-29)
	
	/* static �ʵ��� ����� static block���� �ϱ�
	    �޼ҵ念���� �ڵ尡 �� �ε��Ǹ� �ڵ����� ����  */
	static{
		info = model;
		info += "(";
		info += makeDay;
		info += ")";
	}
	
		
}
