//1
//Write a program to check if a number is divisible by 5

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
	
		System.out.print("Is the number " + number + " divisible by 5? " + (number%5==0));
	}
}

 