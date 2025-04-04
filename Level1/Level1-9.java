//9
//Rewrite program 8 to do the countdown using the for-loop


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int counter;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the count down number: ");
		counter = input.nextInt();
		
		for (int i = counter; i>=1; i--){
		
			System.out.print(i + "\n");
			
		}

	}
}