package ch06.exam09;

public class Member {
	String name;
	final String ssn; 
	//final == �����ڸ� ���ؼ� �� �ѹ��� �����ȸ�� �ְ� �� ���ĺ��ʹ� �ٲ� �� ����
	//�����ڷ� �� �ְ� ������ �̸� ���� �־ �ȵ�..
	
	static final String NATION ="�ѱ�";
	//��� static final�� ����� �ʵ�� �빮�ڷ� �ۼ�!!
	//static -- ��� ��ü �ȿ� ��������� �ʰ� Ŭ���� �ȿ���
	//final  -- ���� �ٲ� �� ����
	//static{ } �ȿ����� �ѹ��� ���������� �� ���� ����
	
	Member(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		
		
	}
}
