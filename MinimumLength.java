package Practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MinimumLength {

    public static void main(String[] args) {
        // Sample inputs
        String manufacturingDateStr1 = "2022-01-15T00:00:00";
        int monthsUntilExpiry1 = 12;

        String manufacturingDateStr2 = "2023-06-20T00:00:00";
        int monthsUntilExpiry2 = 18;

        // Checking expiry for the specific date 2024-06-01
        LocalDate expiryDate1 = calculateExpiryDate(manufacturingDateStr1, monthsUntilExpiry1);
        boolean isExpired1 = isExpired(expiryDate1, LocalDate.of(2024, 6, 1));
        System.out.println(isExpired1); // Output: true

        LocalDate expiryDate2 = calculateExpiryDate(manufacturingDateStr2, monthsUntilExpiry2);
        boolean isExpired2 = isExpired(expiryDate2, LocalDate.of(2024, 6, 1));
        System.out.println(isExpired2); // Output: false
    }

    public static LocalDate calculateExpiryDate(String manufacturingDateStr, int monthsUntilExpiry) {
        // Parse manufacturing date
        LocalDate manufacturingDate = LocalDate.parse(manufacturingDateStr, DateTimeFormatter.ISO_DATE_TIME);

        // Calculate expiry date by adding monthsUntilExpiry to manufacturing date
        LocalDate expiryDate = manufacturingDate.plusMonths(monthsUntilExpiry);

        return expiryDate;
    }

    public static boolean isExpired(LocalDate expiryDate, LocalDate currentDate) {
        // Check if expiry date is before the current date
        return expiryDate.isBefore(currentDate);
    }
}






