//2
//Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of a: ");
        a = input.nextInt();
		System.out.print("Enter value of b: ");
        b = input.nextInt();
		System.out.print("Enter value of c: ");
        c = input.nextInt();
		int r1 = a + b *c;
		int r2 = a * b + c;
		int r3 =  c + a / b;
		int r4 = a % b + c;
		System.out.println("The results of Int Operations are" + r1 + ", "+ r2 + ", "+ r3 + " and " + r4);
	}
	
}
		
		