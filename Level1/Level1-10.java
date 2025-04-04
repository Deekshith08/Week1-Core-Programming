//10
//Write a program to find the sum of numbers until the user enters 0


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 0 if u want to exit. ");

		System.out.print("Enter the number : ");
		number = input.nextInt();
		sum += number;
	
		while(number!=0){
			
		System.out.print("Enter the number : ");
			number = input.nextInt();
			sum += number;
		}
		System.out.print("The sum is " + sum);

	}
}