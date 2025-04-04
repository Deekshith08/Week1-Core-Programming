//16
//Create a program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number");
		number = input.nextInt();
           
        for(int i=1; i<=number; i++){
			
			if(i%2==0){
				System.out.println(i + " : Even");
			}
			else if(i%2!=0){
				System.out.println(i + " : Odd");
			}		
		}
	}
}