//12
//Create a program to convert weight in pounds to kilograms.

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		double wt_in_pounds,wt_in_kg;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds : ");
		wt_in_pounds = input.nextDouble();
		
		wt_in_kg = wt_in_pounds*2.2;
		
		System.out.println(wt_in_kg);
	}
}
		