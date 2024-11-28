package Practice;
import java.util.Scanner;

public class Trim {

	    public static int countWords(String str) {
	        str = str.trim();
	        if (str.isEmpty()) {
	            return 0;
	        }
	        
	        String[] words = str.split("\\s+");
	        
	        return words.length;
	    }

	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	        String str = scan.nextLine();
	        scan.close();
	        
	        int count = countWords(str);

	        System.out.println("Number of words in str1: " + count);
	    }
}
