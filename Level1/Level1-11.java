//11
//Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 0 or -ve number if u want to exit. ");
		System.out.print("Enter the number : ");
		number = input.nextInt();
		sum += number;
	
		while(true){
			
		System.out.print("Enter the number : ");
			number = input.nextInt();
			if(number<=0){
				break;
			}
			sum += number;
		}
		System.out.print("The sum is " + sum);

	}
}