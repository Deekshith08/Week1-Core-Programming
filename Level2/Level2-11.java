//11
//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int principal,rate,time;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter principal amount : ");
		principal = in.nextInt();
		
		System.out.print("Enter Intrest rate : ");
		rate = in.nextInt();
		
		System.out.print("Enter time in yrs : ");
		time = in.nextInt();
		
		int simple_intrest = principal * rate * time / 100;
		
		System.out.println("The Simple Interest is " + simple_intrest + " for Principal " + principal + " , Rate of Interest " + rate + " and Time " + time);
	}
}

		
