//4
//Write a program to check for the natural number and write the sum of n natural numbers 


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		int sum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		if (number>=1){
			sum = number * (number+1) / 2;
			System.out.print("The sum of " + number + " natural numbers is " + sum);
		}
		else{
			System.out.print("Entered number is not a natural number");
		}
	}
}