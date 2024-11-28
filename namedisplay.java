package demo1;
import java.util.Scanner;

public class namedisplay {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = new String();
		String[] a = new String[scan.nextInt()];
		scan.nextLine();
		for (int i=0; i<a.length; i++) {
			a[i] = scan.nextLine();
		}
		for (int i=0; i<a.length; i++) {
			s = a[i];
			System.out.println(s.toUpperCase());
		}
	}

}
