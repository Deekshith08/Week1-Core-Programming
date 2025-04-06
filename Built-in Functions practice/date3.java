//3

/*Date Formatting Write a program that: 
➢ Displays the current date in three different formats: 
■ dd/MM/yyyy 
■ yyyy-MM-dd 
■ EEE, MMM dd, yyyy 
Hint: Use DateTimeFormatter with custom patterns for date formatting. 
 */


import java.time.*;
import java.time.format.*;

class DateFormatting{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println(date.format(format1));
        System.out.println(date.format(format2));
        System.out.println(date.format(format3));

    }
}
