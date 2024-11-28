package demo1;

import java.util.Scanner;

public class RatCountHouse {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int unit = scan.nextInt();
		int n = scan.nextInt();
		int[] a = new int[n];
		int sumfood = 0, rf = 0, i = 0;
		
		if (n != 0) {
		
			for(int j=0; j<a.length; j++) {
			a[j] = scan.nextInt();
			}
		
			rf = r * unit;
			
			i=0;
		
			while(sumfood <= rf) {
				sumfood += a[i];
				i++;
			}
			
			System.out.println(i);
		}

		else if(sumfood < rf){
			System.out.println(0);
		}
		else if(n == 0) {
			System.out.println(-1);
		}
    }

}
