//11
//Create a program to find all the multiples of a number taken as user input below 100.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if(number>0 && number<=100){
			for(int i = 100; i>=1; i--){
				if(i%number==0){
				System.out.print(i + "\n");
				}	
			}
		}
		else if(number<0){
			
			System.out.print("Entered number is not a positive number");
		}
		else{
			System.out.print("Entered number is not less than 100");
		}

        
	}
}