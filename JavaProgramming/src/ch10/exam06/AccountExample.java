package ch10.exam06;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("�ܰ�: "+account.getBalance());
		account.deposit(100000);
		System.out.println("�ܰ�: "+account.getBalance());
		
		try{
			account.withdraw(1000000);
		}catch(BalanceInsufficientException e){
			//���� ó�� �ڵ�
			e.printStackTrace();
			System.out.println("****************************************");
			System.out.println(e.toString());
			System.out.println("****************************************");
			System.out.println(e.getMessage());
		}
			
		System.out.println("�ܰ�: "+account.getBalance());
	}
}
