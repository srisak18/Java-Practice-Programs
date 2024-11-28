package demo1;
import java.util.Scanner;

class Test1 extends Object{
	int x, y;
	
	public Test1() {
		x = 100;
		y = 200;
		System.out.println("Test1 . 1");
	}
	
	public Test1(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Test1 . 2");
	}
}

class Test2 extends Test1{
	int a, b;
	int x;
	
	public Test2() {
		a = 300;
		b = 400;
		System.out.println("Test2 . 1");
	}
	
	public Test2(int a, int b) {
		super(a,b);
		this.a = a;
		this.b = b;
		System.out.println("Test2 . 2");
	}
	
	void disp() {
		int x = 999;
		System.out.println("x(local) : " + x);
		System.out.println("x(child) : " + this.x);
		System.out.println("x(parent) : " + super.x);
		System.out.println("y : " + y);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}
}


public class Inheritance {
	public static void main(String[] args) {
		
		Test2 t2 = new Test2(9,99);
		t2.disp();
		
		
	}
}
