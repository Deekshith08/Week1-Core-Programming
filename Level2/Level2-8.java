//8
//Rewrite the above program 7 to find the factors of a number using the while loop


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		int i=1;
		
		if (number>=1){
			while(i<number){
				if(number%i==0){
					System.out.print(i + "\n");
					
				}
				i++;
			}
		}
		else{
			System.out.print("Entered number is not positive");
		}
	}
}