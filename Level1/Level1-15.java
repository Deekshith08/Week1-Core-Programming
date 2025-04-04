


//15
//Rewrite program 14 using for loop

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number");
		number = input.nextInt();
           
        int fact = 1;	
		if(number>=1){
			System.out.print("Given number is natural\n");
			for(int i=number; i>=1; i--){
				
			fact = fact*i;
		    }
			System.out.print("The factorial result is : " + fact);
			
		}
		else{
			System.out.print("Given number is not natural");
		}

	}
}