package demo1;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[2][];
		a[0] = new int[2];
		a[1] = new int[3];
				
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
					System.out.println("Enter value "+ i + j);
					a[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("The elements are:");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
