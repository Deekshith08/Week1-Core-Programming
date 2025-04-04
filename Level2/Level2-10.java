//10
//Create a program to divide N number of chocolates among M children.

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int no_of_choc, no_of_ppl;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter no of chocolates : ");
		no_of_choc = input.nextInt();
		System.out.print("Enter no of people : ");
		no_of_ppl = input.nextInt();
		
		int each_ppl_got = no_of_choc/no_of_ppl;
		int remaining = no_of_choc%no_of_ppl;
		
		System.out.print("The number of chocolates each child gets is " + each_ppl_got + " and the number of remaining chocolates are " + remaining);
	}
}
		