//1
//Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int year;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year greater than 1582: ");
		year = input.nextInt();
		
		if(year>1582){
			if (year % 400 == 0) {
                System.out.println(year + " : leap year");
            } else if (year % 100 == 0) {
                System.out.println(year + " : not leap year");
            } else if (year % 4 == 0) {
                System.out.println(year + " : leap year");
            } else {
                System.out.println(year + " : not leap year");
            }
		}
		else{
			System.out.print("Entered year is not greater than 1582");
		}
	}
}