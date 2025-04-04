//3
//Create a program to find the multiplication table of a number entered by the user from 6 to 9.



import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		if (number>=6 && number<=9){
			for(int i=1; i<=10; i++)
			{
				System.out.print(number + " * " + i + " = " + (number*i) + " \n ");
			}
		}
		else{
			System.out.print("Entered number is not between 6 to 9");
		}
	}
}