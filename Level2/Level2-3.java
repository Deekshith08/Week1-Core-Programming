//3
//Similarly, write the DoubleOpt program by taking double values and doing the same operations.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		double a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of a: ");
        a = input.nextDouble();
		System.out.print("Enter value of b: ");
        b = input.nextDouble();
		System.out.print("Enter value of c: ");
        c = input.nextDouble();
		double r1 = a + b *c;
		double r2 = a * b + c;
		double r3 =  c + a / b;
		double r4 = a % b + c;
		System.out.println("The results of Int Operations are" + r1 + ", "+ r2 + ", "+ r3 + " and " + r4);
	}
	
}
		
		