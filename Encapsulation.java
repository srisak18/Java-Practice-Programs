package demo1;

class BankAccount{
	
	private float balance;
	private int cin;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCin(int cin) {
		this.cin = cin;
	}
	
	public int getCin() {
		return cin;
	}
	
	public void setBalance(float balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}
	
	public float getBalance() {
		return balance;
	}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		
		ba1.setName("Anantha Krishnan");
		ba1.setCin(1008);
		ba1.setBalance(100000);
		
		ba2.setName("Sri Sakthi");
		ba2.setCin(1811);
		ba2.setBalance(500);
		
		System.out.println("Customer1:");
		System.out.println(ba1.getName());
		System.out.println(ba1.getCin());
		System.out.println(ba1.getBalance());
		
		System.out.println();
		
		System.out.println("Customer2:");
		System.out.println(ba2.getName());
		System.out.println(ba2.getCin());
		System.out.println(ba2.getBalance());
		
		
	}

}
