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
	
}
