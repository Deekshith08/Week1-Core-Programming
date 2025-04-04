//6
//Write a program to check whether a number is positive, negative, or zero.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if(number>0){
			System.out.print("Positive");
		}
		else if(number==0){
			System.out.print("Zero");
		}
		else{
			System.out.print("Negative");
		}

	}
}