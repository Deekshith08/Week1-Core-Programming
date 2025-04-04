//8
//Write a program to count down the number from the user input value to 1 using a 
//while loop for a rocket launch


import java.util.Scanner;
class COunter{
	public static void main(String[] args){
		int counter;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the count down number: ");
		counter = input.nextInt();
		
		while(counter>=1){
			System.out.print(counter + "\n");
			counter = counter-1;
		}
		input.close();

	}
}