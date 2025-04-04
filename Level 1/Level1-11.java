
//11
//Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    float number1;
	    float number2;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter first Number : ");
	    number1 = input.nextFloat();
	    System.out.print("Enter Second number : ");
	    number2 = input.nextFloat();
	    float add = number1 + number2;
	    float sub = number1 - number2;
	    float mul = number1 * number2;
	    float div = number1 / number2;

		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + "," + sub + "," + mul + "," + "and" + div
);
	}
}
