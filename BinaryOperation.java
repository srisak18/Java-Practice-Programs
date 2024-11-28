package demo1;

import java.util.Scanner;

public class BinaryOperation {
	public static int operationsBinaryString(String str) {
		char[] c = str.toCharArray();
		int res = Character.getNumericValue(c[0]);
		
		for(int i=1; i<c.length; i++) {
			int x = Character.getNumericValue(c[i+1]);
			if(c[i] == 'A') {
				res = res & x;
			}
			else if(c[i] == 'B') {
				res = res | x;
			}
			else if(c[i] == 'C') {
				res = res ^ x;
			}
			i++;
			
		}
		
		
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int result = operationsBinaryString(s);
		System.out.println(result);
	}
}
