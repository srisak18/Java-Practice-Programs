package DSA;

import java.util.Scanner;

public class LCM {
	
	//By using Brute Force Algorithm.
	public static int bruteForceMethod(int a,int b) {
		
		int res = a>b ? a : b;
		while(true) {
			if(res%a==0 && res%b==0) {
				break;
			}
			res++;
		}
		return res;
	}
	
	//GCD by using Euclidean algorithm.
	public static int euclidGcd(int a, int b) {
		
		while(a!=0 && b!=0) {
			if(a>b) {
				a = a%b;
			}
			else {
				b = b%a;
			}
		}
		if(a!=0) {
			return a;
		}
		else {
			return b;
		}
	}
	
	//LCM using GCD
	public static int lcm(int a, int b) {
		
		return (a*b) / euclidGcd(a, b); 
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		int res = lcm(a, b);
		System.out.println(res);
	}

}
