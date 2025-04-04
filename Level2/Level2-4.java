//4
//Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if (number>0){
			for(int i=1; i<=number; i++)
			{
				if(i%3==0 && i%5==0){ System.out.print("FizzBuzz");}
				else if(i%3==0){ System.out.print("Fizz");}
				else if (i%5==0){ System.out.print("Bizz");}
				else{ System.out.print(i);}
				
			}
		}
		else{
			System.out.print("Entered number is not positive");
		}
	}
}