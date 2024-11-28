package DSA;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		scan.close();
		
		long result = fact2(n);
		System.out.println("The factorial of the given number is: ");
		System.out.println(result);
		
	}
	
	public static long fact1(int n) {
		long res = 1;
		for(int i=2; i<=n; i++) {
			res *= i;
		}
		return res;
	}
	
	public static long fact2(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return n * fact2(n-1);
		}
	}
}
