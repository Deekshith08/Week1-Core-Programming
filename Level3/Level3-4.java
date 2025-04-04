//4
//Write a Program to check if the given number is a prime number or not


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number ");
		number = input.nextInt();
		boolean prime = false;
		if (number>1){
			for(int i=2; i<number; i++){
				if(number%i == 0){
					prime = true;
					break;
				}
			}
			
			if(prime == false){
				System.out.print("Entered number is prime");
			}
			else{
				
			    System.out.print("Entered number is not prime");
			}
		}
		else{
			System.out.print("Entered number is not greater than 1");
		}
	}
}