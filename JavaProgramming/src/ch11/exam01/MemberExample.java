package ch11.exam01;
//String ó�� �츮�� ������ Member���� ���ڿ� �� �� �� �ֵ��� �����
public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		//Object�� ���� �ִ� �� ������
		//equals�� ������ �Ͽ� member��ŭ�� ������ϵ���
		
	}
}
