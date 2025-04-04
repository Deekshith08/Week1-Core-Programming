//9
//Create a program to print the greatest factor of a number beside itself using a loop.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		int max=1;

        for(int i = number-1; i>=1; i--){
			
			if(number%i==0){
				max = i;
				break;
			}
		}
		
		System.out.print(max + " is the greatest factor");
			
	}
}