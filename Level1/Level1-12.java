//12
//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number");
		number = input.nextInt();
		if (number>=1){
			System.out.print("Given number is a natural number\n");
			int sum1 = number*(number+1)/2;	   
        int sum2 = 0;		
		while(number>=1){
			sum2 = sum2+number;
			
			number -=1;
		}
		if(sum1==sum2){
			System.out.println("Both results are same and the sum is " + sum1);
		}
		else{
			System.out.println("Both are not same");
		}
		}
		else{
			System.out.print("Given number is not a natural number");
		}
			
        
	}
}