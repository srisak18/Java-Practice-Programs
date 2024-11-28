package demo1;
import java.util.Scanner;


class Restaurant{
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;
	
	public Restaurant() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhone(long phone) {
		long a = phone/1000000000;
		if(a == 6 || a == 7 || a == 8 || a == 9) {
			this.phone = phone;
		}
	}
	
	public long getPhone() {
		return phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
}

public class Example1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Restaurant r = new Restaurant();
		
		r.setId(1);
		r.setName(scan.nextLine());
		r.setEmail(scan.next());
		r.setPhone(scan.nextLong());
		scan.nextLine();
		r.setAddress(scan.nextLine());
		
		
		
		System.out.println(r.getId());
		System.out.println(r.getName());
		System.out.println(r.getEmail());
		System.out.println(r.getPhone());
		System.out.println(r.getAddress());
	}

}
