//7
//Create a program to find the factors of a number taken as user input.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if (number>=1){
			for(int i=1; i<number; i++)
			{
				if(number%i==0){
					System.out.print(i + "\n");
				}
			}
		}
		else{
			System.out.print("Entered number is not positive");
		}
	}
}