//13
//Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number");
		number = input.nextInt();
		
        int sum1 = number*(number+1)/2;	   
        int sum2 = 0;	
		if(number>=1){
			System.out.print("Given number is natural\n");
			for(int i=number; i>=1; i--){
			sum2 = sum2+i;
		    }
			if(sum1==sum2){
			System.out.println("Both results are same and the sum is " + sum1);
		    }
		    else{
			System.out.println("Both are not same");
		    }
		}
		else{
			System.out.print("Given number is not natural");
		}

	}
}