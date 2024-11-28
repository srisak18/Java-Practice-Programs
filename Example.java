package demo1;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
    	        // Create a scanner object to read input
    	        Scanner scanner = new Scanner(System.in);
    	        
    	        // Prompt the user to enter a string
    	        System.out.println("Enter a string containing alphabets, numbers, and special characters:");
    	        String input = scanner.nextLine();
    	        
    	        // Initialize a StringBuilder to store special characters
    	        StringBuilder specialChars = new StringBuilder();
    	        
    	        // Iterate through the input string
    	        for (int i = 0; i < input.length(); i++) {
    	            char ch = input.charAt(i);
    	            // Check if the character is a special character
    	            if (!Character.isLetterOrDigit(ch)) {
    	                specialChars.append(ch);
    	            }
    	        }
    	        
    	        // Reverse the StringBuilder and convert to a string
    	        String reversedSpecialChars = specialChars.reverse().toString();
    	        
    	        // Print the reversed special characters
    	        System.out.println("Special characters in reverse order: " + reversedSpecialChars);
    	        
    	        // Close the scanner
    	        scanner.close();
  
    }
}
