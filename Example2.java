package demo1;
import java.util.Scanner;

class Menu{
	private int id;
	private String name;
	private int price;
	private String description;
	
	public Menu(int id, String name, int price, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
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
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
public class Example2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = new String(scan.nextLine());
		String[] a = s.split(", ");
		
		int id = 1;
		String name = a[0];
		int price = Integer.parseInt(a[1]);
		String description = a[2];
		Menu m = new Menu(id, name, price, description); 
		
		
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getPrice());
		System.out.println(m.getDescription());
		
	}

}
