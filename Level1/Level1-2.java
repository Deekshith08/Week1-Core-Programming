//2
//Write a program to check if the first is the smallest of the 3 numbers.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number1, number2, number3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		System.out.print("Enter third number: ");
		number3 = input.nextInt();
	
		System.out.print("Is the first number the smallest? " + (number1<number2 && number1<number3));
	}
}
