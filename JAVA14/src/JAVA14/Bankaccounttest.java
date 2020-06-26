package JAVA14;

class Bankaccount {
	int balance = 0;
	void deposit(int amount) {
		balance = balance + amount;
	}
	void withdraw(int amount) {
		if(balance-amount>=0) {
			System.out.println(amount + "원이 출금되었습니다.");
		}
		else 
			System.out.println("잔액이 부족합니다.");
	}
	int getBalance() {
		return balance;
	}
		
}

public class Bankaccounttest{
	public static void main (String args[]) {
		Bankaccount ba = new Bankaccount();
		ba.deposit(100);
		ba.withdraw(150);
		
	}
}
