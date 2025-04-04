//2
//Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int year;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year greater than 1582: ");
		year = input.nextInt();
		
		if(year>1582){
			if ((year%400==0) || (year%4==0 && year%100!=0)){
			    System.out.print(year + " : leap year");
		    }
		    else{
			    System.out.print(year + " : not leap year");
		    }
		}
		else{
			System.out.print("Entered year is not greater than 1582");
		}
	}
}
