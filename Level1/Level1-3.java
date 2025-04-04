//3
//Write a program to check if the first, second, or third number is the largest of the three.


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
	
		System.out.print("Is the first number the largest? " + (number1>number2 && number1>number3));
		System.out.print("\nIs the second number the largest? " + (number2>number1 && number2>number3));
		System.out.print("\nIs the third number the largest? " + (number3>number1 && number3>number2));

	}
}
