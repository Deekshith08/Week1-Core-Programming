//13
//Rewrite the program to find all the multiples of a number below 100 using while loop.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		int i=100;
		if(number>0 && number<=100){
			while(i>=1){
			
				if(i%number==0){
				System.out.print(i + "\n");
				}
				i--;				
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