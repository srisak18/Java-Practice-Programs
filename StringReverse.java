package demo1;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] a = s.split("");
        for(int i=(a.length-1); i>=0; i--) {
        	System.out.print(a[i]);
        }
	}
}
