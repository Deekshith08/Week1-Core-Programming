//14
//Rewrite the above program to find the power of a number using a while loop.


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
		int i = 1;
		while(i<=power){
			result = result*number;
			i++;
		}
		System.out.print(number + " power " +  power + " is " + result);  
	}
}