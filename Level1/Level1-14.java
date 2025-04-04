//14
//Write a Program to find the factorial of an integer entered by the user.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number");
		number = input.nextInt();
           
        int fact = 1;	
		if(number>=1){
			System.out.print("Given number is positive\n");
			while(number>=1){
			fact = fact*number;
			number -=1;
		    }
			System.out.print("The factorial result is : " + fact);
			
		}
		else{
			System.out.print("Given number is not positive");
		}

	}
}