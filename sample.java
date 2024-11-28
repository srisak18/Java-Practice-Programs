package demo1;
import java.util.Scanner;

public class sample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float[] ar = new float[8];
		float total = 0;
		for(int i=0; i<ar.length; i++) {
			System.out.print("Enter mark of Sem " + (i+1) + " : ");
			ar[i] = scan.nextFloat();
			total += ar[i];
		}
		System.out.println("The average of semester marks is :");
		System.out.println(total/8);
	}
}
