package demo1;
import java.util.Scanner;

class Employee{
	
	private int id;
	private String name;
	private String department;
	private float salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String department, float salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public void setId(int id){
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
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public float getSalary() {
		return salary;
	}
	
}

public class Details {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Employee[] a = new Employee[n];
		
		for(int i=0; i<a.length; i++) {
			int id = 1001 + i;
			String name = scan.next();
			String department = scan.next();
			float salary = scan.nextFloat();
			Employee e = new Employee(id, name, department, salary);
			a[i] = e;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("--------------------------------");
			Employee e = a[i];
			System.out.println("ID: " + e.getId());
			System.out.println("Name: " + e.getName());
			System.out.println("Department: " + e.getDepartment());
			System.out.println("Salary: " + e.getSalary());
		}
		
	}

}
