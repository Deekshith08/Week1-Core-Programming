//4

/*Date Comparison Write a program that: 
➢ Takes two date inputs and compares them to check if the first date is before, after, or the same as
the second date. 
Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate
class.
 */

import java.util.Scanner;

import java.time.*;
import java.time.format.*;
class DataComparision{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a date : ");
        String indate1 = input.nextLine();
        System.out.print("Enter a date : ");
        String indate2 = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(indate1, formatter);
        LocalDate date2 = LocalDate.parse(indate2, formatter);
        if(date1.isAfter(date2)){
            System.out.println("first date is after second date");
        }
        else if(date1.isBefore(date2)){
            System.out.println("first date is before second date");
        }
        else System.out.println("first date and second date are same ");
        input.close();
    }
}