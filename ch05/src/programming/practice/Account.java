package programming.practice;

public class Account {

	private String owner;
	private long balance;
	
	public Account() {
	}
	
	public String setOwner() {
		return owner;
	}
	public void getOwner(String owner) {
		this.owner = owner;
	}
	public long setBalance() {
		return balance;
	}
	public void getBalance(long balance) {
		this.balance = balance;
	}
	
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(long balance) {
		this.balance = balance;
	}
	public Account(String owner, long balance) {
		this(owner);
		this.balance = balance;
	}
	
	// 7번 문제
	public long deposit(long amount) {
		return this.balance += amount;
	}
	public long withdraw(long amount) {
		if (this.balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return this.balance = 0;
		}
		return this.balance -= amount;
	}
	
	public static void main(String[] args) {
		Account account = new Account("홍길동", 1000000);
		System.out.println("현재 잔액 : " + account.deposit(1500000));
		System.out.println("현재 잔액 : " + account.withdraw(2650000));
		
	}
	
}
