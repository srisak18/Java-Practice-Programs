package Practice;

import java.util.*;

public class sportsSchedule {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of sports
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Array to store lists of roll numbers for each sport
        List<List<Integer>> sportsData = new ArrayList<>();
        
        // Reading roll numbers for each sport
        for (int i = 0; i < n; i++) {
            String[] rollNumbersStr = scanner.nextLine().split(",");
            List<Integer> rollNumbers = new ArrayList<>();
            for (String numStr : rollNumbersStr) {
                rollNumbers.add(Integer.parseInt(numStr));
            }
            // Sort roll numbers for FCFS order
            Collections.sort(rollNumbers);
            sportsData.add(rollNumbers);
        }
        
        // List to store the schedule lines
        List<String> schedules = new ArrayList<>();
        
        // Process each sport
        for (int sportIndex = 0; sportIndex < n; sportIndex++) {
            List<Integer> rollNumbers = sportsData.get(sportIndex);
            int dayCount = 1;
            boolean currentFN = true; // Start with FN session
            List<Integer> fnStudents = new ArrayList<>();
            List<Integer> anStudents = new ArrayList<>();
            
            for (int rollNumber : rollNumbers) {
                if (currentFN) {
                    fnStudents.add(rollNumber);
                    schedules.add(String.format("Sport %d Day %d FN", sportIndex + 1, dayCount));
                    schedules.add(joinList(fnStudents));
                    currentFN = false; // Switch to AN session next
                } else {
                    anStudents.add(rollNumber);
                    schedules.add(String.format("Sport %d Day %d AN", sportIndex + 1, dayCount));
                    schedules.add(joinList(anStudents));
                    currentFN = true; // Switch to FN session next
                    dayCount++;
                }
            }
            
            // Handle any remaining students if session alternates and we end on AN
            if (!anStudents.isEmpty()) {
                schedules.add(String.format("Sport %d Day %d FN", sportIndex + 1, dayCount));
                schedules.add(joinList(anStudents));
            }
            
            // Increment day count if we ended on AN session
            if (!currentFN) {
                dayCount++;
            }
        }
        
        // Print the generated schedule
        for (String schedule : schedules) {
            System.out.println(schedule);
        }
        
        scanner.close();
    }
    
    // Helper method to join list elements into a space-separated string
    private static String joinList(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}


