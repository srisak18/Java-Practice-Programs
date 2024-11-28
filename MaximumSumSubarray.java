package Practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumSumSubarray {

		public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        scan.close();
	        generateUniqueInitials(input);
	    }

	    public static void generateUniqueInitials(String input) {
	        String[] names = input.split(",");
	        Map<String, Integer> initialsMap = new HashMap<>();

	        for (String name : names) {
	            String[] parts = name.trim().split(" ");
	            
	            if (parts.length == 2) {
	                String firstName = parts[0];
	                String lastName = parts[1];
	                String initial = (firstName.charAt(0) + "" + lastName.charAt(0)).toUpperCase();

	                if (initialsMap.containsKey(initial)) {
	                    int count = initialsMap.get(initial) + 1;
	                    initialsMap.put(initial, count);
	                    System.out.println(initial.toLowerCase() + count);
	                } 
	                else {
	                    initialsMap.put(initial, 0);
	                    System.out.println(initial.toLowerCase());
	                }
	            }
	        }
	    }
	}

