//5
//Rewrite the program 4 FizzBuzz using the while loop 


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		int i = 1;
		if (number>0){
			while(i<=number){
				
				if(i%3==0 && i%5==0){ System.out.print("FizzBuzz");}
				else if(i%3==0){ System.out.print("Fizz");}
				else if (i%5==0){ System.out.print("Bizz");}
				else{ System.out.print(i);}
				i++;
				
			}
		}
		else{
			System.out.print("Entered number is not positive");
		}
	}
}