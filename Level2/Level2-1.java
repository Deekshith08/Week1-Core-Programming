//1
//Write a program to take 2 numbers and print their quotient and reminder


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number1,number2;
		Scanner input = new Scanner(System.in);
		System.out.print("enter first number : ");
		number1 = input.nextInt();
		System.out.print("enter second number : ");
		number2 = input.nextInt();
		int remainder = number1%number2;
		int quotient = number1/number2;
		System.out.println("The Quotient is " + quotient +  " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
	}
}

		
		