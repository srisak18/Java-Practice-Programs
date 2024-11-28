package DSA;

import java.util.Scanner;

public class TrailingZeros {
	
	public static int numberOfTrailingZeros(long n) {
		
		int count = 0;
		int powOf5 = 5;
		while(powOf5 <= n) {
			count += n/powOf5;
			powOf5 = powOf5 * 5;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		scan.close();
		
		int count = numberOfTrailingZeros(n);
		
		System.out.println("The count of trailing zeros is "+count);
	}

}
