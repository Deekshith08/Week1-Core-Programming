//12
//Create a program to find the power of a number.

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number,power;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		System.out.print("Enter the power required: ");
		power = input.nextInt();
		int result=1;
		for(int i=1; i<=power;i++){
			result = result*number;
		}
		System.out.print(number + " power " +  power + " is " + result);

        
	}
}