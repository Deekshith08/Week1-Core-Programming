//10
//Rewrite the above program to print the greatest factor of a number beside itself using a while loop.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		int max=1;
		int i = number-1;
		while(i>=1){
			
			if(number%i==0){
				max = i;
				break;
			}
			i--;
		}
		System.out.print(max + " is the greatest factor");
	}
}