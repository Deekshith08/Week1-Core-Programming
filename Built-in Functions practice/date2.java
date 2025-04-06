//3

/*Date Arithmetic Create a program that: 
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it. 
➢ Then subtracts 3 weeks from the result. 
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and minusWeeks() methods. */

import java.util.Scanner;

import java.time.*;
import java.time.format.*;
class DataArithmetic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String indate = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(indate, formatter);
        LocalDate newdate = date.plusDays(7);
        newdate = newdate.plusMonths(1);
        newdate = newdate.plusYears(2);
        newdate = newdate.minusWeeks(3);
        System.out.println(newdate);

        input.close();
    }
}

