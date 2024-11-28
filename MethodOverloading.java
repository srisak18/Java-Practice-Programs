package demo1;

class Calculator {
	
	int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	double add(double a, double b) {
		double sum = a+b;
		return sum;
	}
	
	int add(int a, int b, int c){
		int sum =a+b+c;
		return sum;
	}
	
	float add(int a, float b, int c) {
		float sum = a+b+c;
		return sum;
	}
	
	double add(int a, float b, double c) {
		double sum = a+b+c;
		return sum;
	}
	
	double add(double a, double b, double c) {
		double sum = a+b+c;
		return sum;
	}
	
	float add(int a, int b, float c) {
		float sum = a+b+c;
		return sum;
	}
}

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(2,5,32.9f));
	}
}
