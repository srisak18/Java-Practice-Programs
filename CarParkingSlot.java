package demo1;

import java.util.Scanner;

public class CarParkingSlot {
	
	public static int maxCarsParked(int n, char[] a) {
		int maxCars = 0;
		int currentCars = 0;
		 
		for(int i=0; i<n; i++) {
			if(a[i] == 'S') {
				currentCars++;
			}
			else {
				maxCars = Math.max(maxCars, currentCars);
				currentCars = 0;
			}
		}
		
		maxCars = Math.max(maxCars, currentCars);
		return maxCars;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		char[] a = s.toCharArray();
		int result = maxCarsParked(n, a);
		System.out.println(result);
		
	}
}
