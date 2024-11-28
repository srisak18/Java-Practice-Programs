package demo1;

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	private String country;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
}

public class Info{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		Person[] a = new Person[n];
		
		for(int i=0; i<a.length; i++) {
			String name = scan.nextLine();
			int age = Integer.parseInt(scan.nextLine());
			String country = scan.nextLine();
			
			Person p = new Person();
			a[i] = p;
			p.setName(name);
			p.setAge(age);
			p.setCountry(country);
		}
		
		
		for(int i=0; i<a.length; i++) {
			Person p = a[i];
			System.out.println("-------------------------------------");
			System.out.println("Name : " + p.getName());
			System.out.println("Age : " + p.getAge());
			System.out.println("Country : " + p.getCountry());
		}
		
		
	}
}