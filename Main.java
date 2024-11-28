package Practice;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] a = new int[n];
	        
	        for(int i=0; i<a.length; i++) {
	        	a[i] = scan.nextInt();
	        }
	        scan.close();
	        
	        int[] temp = new int[n];
	        int index = 0;
	        
	        for (int i = 0; i < n; i++) {
	            if (a[i] > 0) {
	                temp[index] = a[i];
	                index++;
	            }
	        }
	        
	        for (int i = 0; i < n; i++) {
	            if (a[i] < 0) {
	                temp[index] = a[i];
	                index++;
	            }
	        }
	        
	        for (int i = 0; i < n; i++) {
	            a[i] = temp[i];
	        }
	        
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }
	}
