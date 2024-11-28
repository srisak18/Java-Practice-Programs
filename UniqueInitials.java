package Practice;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueInitials {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String[] str = input.split(",");
		uniqueInitials(str);
	}
	
	public static void uniqueInitials(String[] str) {
		String[] st1 = new String[str.length];
		
		for(int i=0; i<str.length; i++) {
			st1[i] = str[i].substring(0,1);
			for(int j=0; j<str[i].length()-1; j++) {
				if(str[i].charAt(j) == ' ' && str[i].charAt(j+1) != ' ') {
					st1[i] = st1[i] + str[i].charAt(j+1);
				}
			}
		}
		
		HashSet<String> set = new HashSet<>();
		for(String s : st1) {
			set.add(s);
		}
		
		for(String s : set){
			int count=0;
			for(int i=0; i<st1.length; i++) {
				if(s.equals(st1[i])) {
					if(count == 0) {
						st1[i] = st1[i];
						count++;
					}
					else if(count > 0) {
						st1[i] = st1[i] + count;
						count++;
					}
				}
			}
		}
		
		for(String s : st1) {
			System.out.println(s);
		}
	}
}









